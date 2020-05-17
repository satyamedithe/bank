package com.springbootbank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootbank.entity.CustomerEntity;
import com.springbootbank.exception.RecordNotFoundException;
import com.springbootbank.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repository;
	
	public List<CustomerEntity> getAllCustomers()
	{
		List<CustomerEntity> result = (List<CustomerEntity>) repository.findAll();
		
		if(result.size() > 0) {
			return result;
		} else {
			return new ArrayList<CustomerEntity>();
		}
	}
	
	public CustomerEntity getCustomerById(Long id) throws RecordNotFoundException 
	{
		Optional<CustomerEntity> customer = repository.findById(id);
		
		if(customer.isPresent()) {
			return customer.get();
		} else {
			throw new RecordNotFoundException("No Customer record exist for given id");
		}
	}
	
	public void saveOrUpdate(CustomerEntity entity){
		
		repository.save(entity);
	}
	
	public void deleteCustomerById(Long id) throws RecordNotFoundException 
	{
		Optional<CustomerEntity> customer = repository.findById(id);
		
		if(customer.isPresent()) 
		{
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No Customer record exist for given id");
		}
	}
		
}
