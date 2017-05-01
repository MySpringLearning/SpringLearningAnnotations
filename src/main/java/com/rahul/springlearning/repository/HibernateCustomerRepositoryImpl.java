package com.rahul.springlearning.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rahul.springlearning.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepositoryInterface {

	/* (non-Javadoc)
	 * @see com.rahul.springlearning.repository.CustomerRepositoryInterface#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customerList = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("rahul");
		customer.setLastName("kumar");

		customerList.add(customer);

		return customerList;
	}

}
