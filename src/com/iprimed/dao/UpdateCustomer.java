package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;

public class UpdateCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inbuild hibernate xml file using factory
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Customer.class)
						.buildSessionFactory();
				
				//create session
				Session session = factory.getCurrentSession();
				try
				{
					//set customer id
					int custId = 7;
					
					//begin transaction
					session.beginTransaction();
					System.out.println("transaction started");
					
					//get customer using customer id
					Customer customer = session.get(Customer.class,custId);
					//System.out.println("got customer details");
					
					//update customer email
//					customer.setEmail("abc@gmail.com");
//					System.out.println("updated customer email address");
					
					int res = session.createQuery("update Customer set email='test@yahoo.co.in'").executeUpdate();
					System.out.println("updated customer email address");
					
					
					//commit changes in database
					session.getTransaction().commit();
					System.out.println("committed in database successfully");
					
				} 
				catch(Exception e)
				{
					System.out.println(e);
				} 
				finally
				{
					session.close();
					factory.close();
				}
	}

}
