package com.example.cassandra.com.example.cassandra.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datastax.driver.core.utils.UUIDs;
import com.example.cassandra.com.example.cassandra.model.Customer;
import com.example.cassandra.com.example.cassandra.repo.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	CustomerRepository customerRepository;
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		System.out.println("called getAllCustomersMethod");
		List<Customer> customers=new ArrayList<Customer>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
		
	}

	public ResponseEntity<Customer>createCustomer(@Valid @RequestBody Customer customer ){
		System.out.println("create Customer:"+customer.getCustomerName()+"...");
		customer.setCustomerId(1);
		customer.setCustomerAge(25);
		customer=customerRepository.save(customer);
		return new ResponseEntity<>(customer,HttpStatus.OK);
		
	}

}
