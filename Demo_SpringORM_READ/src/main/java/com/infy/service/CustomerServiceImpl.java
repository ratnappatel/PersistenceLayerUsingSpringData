package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.CustomerDTO;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerRepository;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	

	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException {

		CustomerDTO customerDTO = customerRepository.getCustomer(customerId);

		if (customerDTO == null) {
			throw new InfyBankException("Service.CUSTOMER_UNAVAILABLE");
		}

		return customerDTO;
	}
}

