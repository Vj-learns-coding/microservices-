package com.order.app.service;

import java.util.UUID;

import com.order.app.dto.CustomerRequest;
import com.order.app.dto.CustomerResponse;

public interface CustomerService {
	
	public CustomerResponse createCustomer(CustomerRequest customer);
	
	public CustomerResponse getCustomerById(UUID id);

	public void deleteCustomerById(UUID id);
}
