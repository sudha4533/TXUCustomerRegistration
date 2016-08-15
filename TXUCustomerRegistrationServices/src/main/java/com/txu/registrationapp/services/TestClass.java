package com.txu.registrationapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.txu.registrationapp.dao.ServicePlanDAO;

@Component
public class TestClass {
	
	@Autowired 
	private ServicePlanDAO servicePlanDAO;
	
	public void test() {
		System.out.println("Hello Ranveeer");
		
		servicePlanDAO.getServicePlans();
	}
}
