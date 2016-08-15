package com.txu.registrationapp.services.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.txu.registrationapp.dao.ServicePlanDAO;
import com.txu.registrationapp.model.ServicePlan;

@Component
@WebService(endpointInterface = "com.txu.registrationapp.services.soap.UtilityPlanService", serviceName = "UtilityPlanServiceImpl")
public class UtilityPlanServiceImpl implements UtilityPlanService {

	@WebMethod
	@Transactional
	public List<ServicePlan> getServicePlans() {

		List<ServicePlan> serviceplans = new ServicePlanDAO().getServicePlans();
		
		return serviceplans;

	}
	


}
