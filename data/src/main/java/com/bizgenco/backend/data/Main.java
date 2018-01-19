package com.bizgenco.backend.data;

import com.bizgenco.backend.data.dao.CustomerDAO;
import com.bizgenco.backend.data.dao.impl.HibernateCustomerDAO;
import com.bizgenco.backend.data.model.Customer;

/**
 * Hello world!
 * 
 * 
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Creo un customer" );
        Customer newCustomer = new Customer("Miguel", "Goyena", "miguel.goyena@gmail.com");
        CustomerDAO customerDAO = new HibernateCustomerDAO();
        customerDAO.createCustomer(newCustomer);
        System.out.println( "Creado el customer MiguelGoyena" );
        
    }
}
