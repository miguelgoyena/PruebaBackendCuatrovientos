package com.bizgenco.backend.data.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bizgenco.backend.data.dao.CustomerDAO;
import com.bizgenco.backend.data.model.Customer;

public class HibernateCustomerDAO implements CustomerDAO {

	public void createCustomer(Customer customerToCreate) {
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Customer.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the customer...");
			session.save(customerToCreate);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
	}
	
	

}
