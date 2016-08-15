package com.txu.registrationapp.services.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.txu.registrationapp.model.ServicePlan;

@WebService
public interface UtilityPlanService {

	@WebMethod
	public List<ServicePlan> getServicePlans();
}
