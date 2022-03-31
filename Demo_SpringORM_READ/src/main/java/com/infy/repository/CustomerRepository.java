package com.infy.repository;

import com.infy.dto.CustomerDTO;

public interface CustomerRepository{
	public CustomerDTO getCustomer(Integer customerId);
}
