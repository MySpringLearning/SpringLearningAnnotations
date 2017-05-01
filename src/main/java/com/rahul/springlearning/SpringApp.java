package com.rahul.springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.springlearning.service.CustomerService;

public class SpringApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		CustomerService customerService = context.getBean("customerService",CustomerService.class);
		
		System.out.println(customerService.findAll().get(0).getFirstName());

	}

}
