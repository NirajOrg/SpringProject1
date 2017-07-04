package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;

public class App 
{
	/* Main method to start
	 * adding customer 1 
	 * adding customer 3
	 * adding customer 4
	 * adding customer 5
	 */
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer1 = new Customer(1, "mkyong",28);
        customerDAO.insert(customer1);
    	
        Customer customer2 = new Customer(2, "niraj",28);
        customerDAO.insert(customer2);
        

        Customer customer3 = new Customer(3, "brij",28);
        customerDAO.insert(customer3);
        

        Customer customer4 = new Customer(4, "anupriya",28);
        customerDAO.insert(customer4);
       
        Customer customer5 = new Customer(5, "anupriya",28);
        customerDAO.insert(customer5);

        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1);
        

        Customer customer2 = customerDAO.findByCustomerId(2);
        System.out.println(customer2);
        

        Customer customer3 = customerDAO.findByCustomerId(3);
        System.out.println(customer3);

        Customer customer4 = customerDAO.findByCustomerId(4);
        System.out.println(customer4);
        
        Customer customer5 = customerDAO.findByCustomerId(5);
        System.out.println(customer5);
        
        

        
    }
}
