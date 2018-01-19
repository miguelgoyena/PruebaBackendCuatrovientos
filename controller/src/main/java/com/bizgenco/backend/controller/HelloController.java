package com.bizgenco.backend.controller;

import org.springframework.web.bind.annotation.RestController;
import com.bizgenco.backend.data.dao.CustomerDAO;
import com.bizgenco.backend.data.dao.impl.HibernateCustomerDAO;

import org.springframework.web.bind.annotation.RequestMapping;


/*
 * https://spring.io/guides/gs/rest-service/
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
    	CustomerDAO dao = new HibernateCustomerDAO();
    	
    	
    	//Llamar al DAO para que haga algo!!!
        return "Greetings from Spring Boot!";
    }

}
