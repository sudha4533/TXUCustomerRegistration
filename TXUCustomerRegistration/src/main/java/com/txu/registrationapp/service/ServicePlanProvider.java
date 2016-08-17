/**
 * 
 */
package com.txu.registrationapp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.txu.registrationapp.model.Customer;
import com.txu.webserviceclients.jms.MyMessageSender;
import com.txu.webserviceclients.soap.client.SoapClient;
import com.txu.registrationapp.soapservice.ServicePlan;

/**
 * @author Sudha Gunamgari
 */

public class ServicePlanProvider {

	@Autowired
	MyMessageSender msgSender;

	@SuppressWarnings("deprecation")
	public boolean addServicePlan(Customer customer) {

		List<ServicePlan> serviceplans = null;

		try {

			serviceplans = new SoapClient().getServices();

			if (serviceplans != null) {
				
				ServicePlan plan = serviceplans.get(0);
				int service_id = plan.getServiceId();

				String msg = service_id + ":" + customer.getId();

				msgSender.sendMessage(msg);

				com.txu.registrationapp.model.ServicePlan servicePlan = new com.txu.registrationapp.model.ServicePlan();

				servicePlan.setService_id(plan.getServiceId());
				servicePlan.setDescription(plan.getDescription());
				servicePlan.setPlan_name(plan.getPlanName());

				int day, month, year;
				day = plan.getStartDate().getDay();
				month = plan.getStartDate().getMonth();
				year = plan.getStartDate().getYear();

				Date date = new Date(year - 1900, month, day);

				servicePlan.setStart_date(date);

				day = plan.getEndDate().getDay();
				month = plan.getEndDate().getMonth();
				year = plan.getEndDate().getYear();

				date = new Date(year - 1900, month, day);

				servicePlan.setEnd_date(date);

				customer.setServicePlan(servicePlan);

				return true;
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

}
