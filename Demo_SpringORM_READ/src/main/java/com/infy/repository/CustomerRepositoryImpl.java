package com.infy.repository;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.infy.dto.CustomerDTO;
import com.infy.entity.Customer;

@Repository(value = "customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public CustomerDTO getCustomer(Integer customerId) {
		CustomerDTO customerDTO=null;	
		Customer customer = entityManager.find(Customer.class, customerId);
		if(customer!=null){
			customerDTO=new CustomerDTO();
			customerDTO.setCustomerId(customer.getCustomerId());
			customerDTO.setDateOfBirth(customer.getDateOfBirth());
			customerDTO.setEmailId(customer.getEmailId());
			customerDTO.setName(customer.getName());
			customerDTO.setCustomerType(customer.getCustomerType());
		}
		return customerDTO;
	}
}
