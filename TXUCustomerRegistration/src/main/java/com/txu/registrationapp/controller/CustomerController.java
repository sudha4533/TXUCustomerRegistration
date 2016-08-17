package com.txu.registrationapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.txu.registrationapp.model.Customer;
import com.txu.registrationapp.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String displayForm(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("message", "Register here");
		return "register";
	}

	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String addCustomer(HttpServletRequest request, @ModelAttribute("customer") Customer customer, ModelMap model) {

		if (customer != null) {

			if (customerService.addCustomer(customer) && customer.getServicePlan() != null) {

				model.put("customer", customer);
				model.put("message", "Registration successfull");
				return "home";

			} else {
				model.put("customer", customer);
				model.put("message", "Registration successfull, But Service Plan is not updated");
				return "home";
			}
		} else {
			model.put("message", "Registration failed, Please register again");
			return "register";

		}
	}

}
