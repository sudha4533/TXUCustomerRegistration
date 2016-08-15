package com.txu.registrationapp.services.rest;


import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.txu.registrationapp.dao.CustomerServiceDAO;
import com.txu.registrationapp.model.Customer;

@Service
@Path("/customer")
@Transactional
public class CustomerServiceImpl {

	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	@HeaderParam(value = "content-type = application/octet-stream")
	
	public Customer getCustomerDetailsById(@PathParam("param") int id) {

		Customer customer = new CustomerServiceDAO().getCustomerDetailsById(id);

		return customer;

	}

}
