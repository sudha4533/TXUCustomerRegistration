package com.txu.webserviceclients.soap.client;

import java.util.List;

import com.txu.registrationapp.model.ServicePlan;

public class SoapClient {

	public List<ServicePlan> getServices() {

		UtilityPlanServiceImpl soapser = new UtilityPlanServiceImpl();

		UtilityPlanService splport = soapser.getUtilityPlanServiceImplPort();

		List<ServicePlan> srlist = splport.getServicePlans();

		return srlist;

	}

}
