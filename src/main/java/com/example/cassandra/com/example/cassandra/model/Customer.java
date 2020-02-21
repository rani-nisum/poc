package com.example.cassandra.com.example.cassandra.model;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("CUSTOMERS")
public class Customer {
@PrimaryKey
public int customerId;
public String customerName;
public int customerAge;

public Customer(int customerId, String customerName, int customerAge) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAge = customerAge;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getCustomerAge() {
	return customerAge;
}
public void setCustomerAge(int customerAge) {
	this.customerAge = customerAge;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
			+ "]";
}

}
