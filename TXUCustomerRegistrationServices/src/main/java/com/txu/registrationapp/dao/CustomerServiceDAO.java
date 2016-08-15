package com.txu.registrationapp.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import com.txu.registrationapp.model.Customer;
import com.txu.registrationapp.util.HibernateSessionManager;

public class CustomerServiceDAO {


	public Customer getCustomerDetailsById(int id) {
		
		
		
		Session session = HibernateSessionManager.getSessionFactory().openSession();
		
	
		Query query = session.createQuery("from Customer where id = :id ");
	    query.setParameter("id", id);
	    
	    Customer customer = (Customer) query.uniqueResult();
	    
	    session.close();
	    
	    return customer;
		
	}
	
}
