package com.txu.webserviceclients.soap.client;

import java.util.List;

import com.txu.webserviceclients.soap.wsdlimports.ServicePlan;
import com.txu.webserviceclients.soap.wsdlimports.UtilityPlanService;
import com.txu.webserviceclients.soap.wsdlimports.UtilityPlanServiceImpl;

public class SoapClient {

	public List<ServicePlan> getServices() {

		UtilityPlanServiceImpl soapser = new UtilityPlanServiceImpl();

		UtilityPlanService splport = soapser.getUtilityPlanServiceImplPort();

		List<ServicePlan> srlist = splport.getServicePlans();

		return srlist;

	}

}
