package com.order.app.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.app.dto.CustomerRequest;
import com.order.app.dto.CustomerResponse;
import com.order.app.service.CustomerService;


@RestController
public class CustomerController {
	
	
	@Autowired
	CustomerService customerService;
	
	
	@PostMapping(value="/createCustomer")
	public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest customerRequest){
		
		return ResponseEntity.ok(customerService.createCustomer(customerRequest));
		
	}
	
	
	@GetMapping(value="/getCustomer")
	public ResponseEntity<CustomerResponse> getCustomerById(@PathVariable UUID id){
		
	
		return ResponseEntity.ok(customerService.getCustomerById(id));
				
			
	}
	
	
	@DeleteMapping(value="/deleteCustomer")
	public ResponseEntity<String> deleteCustomerById(@PathVariable UUID id){
		
		customerService.deleteCustomerById(id);
		
		return ResponseEntity.ok().body("it's deleted yaar.");
					
			
	}
	
	
}
