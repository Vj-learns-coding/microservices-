package com.order.app.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponse {
	
	private UUID id;
	private String name;
	private String email;
	private String phone;
	private LocalDateTime createdAt;
	

}
