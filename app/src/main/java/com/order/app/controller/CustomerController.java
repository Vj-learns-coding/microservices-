package com.order.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.app.dto.CustomerRequest;


@RestController
public class CustomerController {
	
	//create customer 
	//pathvariable
	//requestparam
	//requestbody
	
	
	public ResponseEntity<CustomerRequest> createCustomer(@RequestBody CustomerRequest customer){
		
		return null;
		
	}
		
	//get customer by id
	
	//get customer by email
	
	//delete customer

	
}
