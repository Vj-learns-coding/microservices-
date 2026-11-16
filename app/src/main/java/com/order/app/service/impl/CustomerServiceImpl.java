package com.order.app.service.impl;

import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.order.app.dto.CustomerRequest;
import com.order.app.dto.CustomerResponse;
import com.order.app.entity.Customer;
import com.order.app.exception.CustomerNotFoundException;
import com.order.app.repository.CustomerRepository;
import com.order.app.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public CustomerResponse createCustomer(CustomerRequest customerRequest) {
		// TODO Auto-generated method stub
		
		Customer customer = modelMapper.map(customerRequest, Customer.class);
		Customer SavedCustomer = customerRepo.save(customer);
		
		return modelMapper.map(SavedCustomer, CustomerResponse.class);
	}
	
	//get Customer 
	@Override
	public CustomerResponse getCustomerById(UUID id) {
		// TODO Auto-generated method stub
		
		Optional<Customer> customer = customerRepo.findById(id);
		
		if(customer.isEmpty()) {
			throw new CustomerNotFoundException("No customer found based on the given id");
		}
		
		return modelMapper.map(customer.get(), CustomerResponse.class);
	}
		
	//delete customer
	public void deleteCustomerById(UUID id) {
		
		if(!customerRepo.existsById(id)) {
			throw new CustomerNotFoundException("No customer found based on the given id");
		}
		
		customerRepo.deleteById(id);
	}
	
}
