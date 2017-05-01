package com.rahul.springlearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.springlearning.model.Customer;
import com.rahul.springlearning.repository.CustomerRepositoryInterface;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired
	private CustomerRepositoryInterface customerRepository;//  = new HibernateCustomerRepositoryImpl();
	
	@Autowired
	public CustomerServiceImpl(CustomerRepositoryInterface customerRepositoryInterface) {
		// TODO Auto-generated constructor stub
		this.customerRepository = customerRepositoryInterface;
	}
	
	/* (non-Javadoc)
	 * @see com.rahul.springlearning.service.CustomerService#findAll()
	 */
	//@Override
	public List<Customer> findAll(){
		
		return customerRepository.findAll();
		
	}

	@Autowired
	public void setCustomerRepository(CustomerRepositoryInterface customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
	
}
