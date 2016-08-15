package com.txu.registrationapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.txu.registrationapp.dao.CustomerDAO;
import com.txu.registrationapp.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private ServicePlanProvider servicePlan;
	
	private CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Transactional
	public boolean addCustomer(Customer customer) {
		
		if (customerDAO.addCustomer(customer)) {
			
			if(servicePlan.addServicePlan(customer)) {
				return true;
			}
			return false;
			
		}
		return false;

	}
	
	
	

}
