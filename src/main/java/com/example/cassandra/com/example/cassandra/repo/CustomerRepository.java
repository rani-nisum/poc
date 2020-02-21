package com.example.cassandra.com.example.cassandra.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.cassandra.com.example.cassandra.model.Customer;

public interface CustomerRepository extends CassandraRepository<Customer>{

}
