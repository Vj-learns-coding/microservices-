package com.order.app.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}
