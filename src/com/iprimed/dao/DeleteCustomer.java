package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;

public class DeleteCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		System.out.println("transaction started");
		try
		{
			int custId=2;
			//begin transaction
			session.beginTransaction();
			
			//get customer using customer id
			Customer customer = session.get(Customer.class,custId);
			System.out.println("got customer details");
			
			//delete customer
			session.delete(customer);
			System.out.println("customer deleted successfully");
			
			//commit changes in db
			session.getTransaction().commit();
			System.out.println("committed changes in db");
			
		}
		finally
		{
			session.close();
			factory.close();
		}

	}

}
