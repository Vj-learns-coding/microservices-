package com.order.app.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.order.app.dto.CustomerRequest;
import com.order.app.dto.CustomerResponse;
import com.order.app.entity.Customer;
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

}
