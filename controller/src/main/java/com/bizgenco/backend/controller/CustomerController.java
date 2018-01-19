package com.bizgenco.backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.bizgenco.backend.data.dao.CustomerDAO;
import com.bizgenco.backend.data.dao.impl.HibernateCustomerDAO;
import com.bizgenco.backend.data.model.Customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CustomerController {

	/*
	 * https://spring.io/guides/gs/rest-service/
	 * Example URL: http://localhost:8080/addCustomer?customFirstName=Joaquin&customLastName=Rodriguez&customEmail=joaquin.rodriguez@gmail.com
	 */
    @RequestMapping("/addCustomer") 
    public Customer addCustomer(@RequestParam(value="customFirstName", defaultValue="XXX") String customFirtName, @RequestParam(value="customLastName", defaultValue="XXX") String customLastName, @RequestParam(value="customEmail", defaultValue="XXX") String customEmail) {
    	
    	//Vamos a crear un Customer
        Customer newCustomer = new Customer(customFirtName, customLastName, customEmail);
        CustomerDAO customerDAO = new HibernateCustomerDAO();
        customerDAO.createCustomer(newCustomer);
        System.out.println( "Creado el customer MiguelGoyena" );
    	//Llamar al DAO para que haga algo!!!
        return newCustomer;
    }
}
