package com.order.app.service;

import com.order.app.dto.CustomerRequest;
import com.order.app.dto.CustomerResponse;

public interface CustomerService {
	
	public CustomerResponse createCustomer(CustomerRequest customer);
}
