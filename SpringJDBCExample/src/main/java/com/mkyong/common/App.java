package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;

public class App 
{
	/* Main method to start
	 * adding customer 1 
	 * adding customer 4
	 * adding customer 6
	 */
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer1 = new Customer(1, "mkyong",28);
        customerDAO.insert(customer1);
    	
        Customer customer2 = new Customer(2, "niraj",28);
        customerDAO.insert(customer2);
        
        Customer customer4 = new Customer(4, "anupriya",28);
        customerDAO.insert(customer4);
        
        Customer customer6 = new Customer(6, "ashish",28);
        customerDAO.insert(customer6);
       
        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1);
        

        Customer customer2 = customerDAO.findByCustomerId(2);
        System.out.println(customer2);
        
        Customer customer4 = customerDAO.findByCustomerId(4);
        System.out.println(customer4);
        
        Customer customer6 = customerDAO.findByCustomerId(6);
        System.out.println(customer6);
        
    }
}
