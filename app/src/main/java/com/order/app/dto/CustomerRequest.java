package com.order.app.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerRequest {

	@NotBlank(message="name can not be empty")
	@Size(max=100)
	private String name;
	
	@Email
	@NotBlank(message="name can not be empty")
	private String email;
	
	@Pattern(regexp="^[0-9]{10,15}$",message="phone number should be between 10 and 15 digits")
	private String phone;
	
}
