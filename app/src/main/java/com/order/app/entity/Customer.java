package com.order.app.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor // needs t
@NoArgsConstructor
@Getter
@Setter
@Table(name="customers")
public class Customer {
	
	//uuid is unique.
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private UUID id;
	
	@Column(name = "full_name" ,nullable = false ,length = 100)
	private String name;
	
	@Column(name="email" ,unique = true ,nullable = false)
	private String email; 
	
	@Column(length=15)
	private int phone;
	
	@Column(name = "created_at", nullable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at", nullable = false)
	private LocalDateTime updatedAt;
	
	@PrePersist // life cycle hooks of entity just like angular.
	private void onCreation()
	{
		this.createdAt = LocalDateTime.now();
		this.updatedAt=this.createdAt;
	}
	
	@PreUpdate
	private void onUpdation()
	{
		
		this.updatedAt= LocalDateTime.now();
	}
}
