package com.iprimed.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;

public class AddCustomer {

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
			//create object to map to database
//			Customer cust = new Customer("Eswar","eswar@gmail.com",9840142569L);
//			Customer cust1=new Customer("Siva","siva123@gmail.com",9087427888L);
//			Customer cust2=new Customer("Mani","mani007@gmail.com",9840247926L);
			
			Customer cust3=new Customer("Satheesh","sathi0@gmail.com",9084581452L);
			
			//start transaction
			session.beginTransaction();
			
			//save object into database
//			session.save(cust);
//			session.save(cust1);
//			session.save(cust2);
			
			session.save(cust3);
			
			//commit changes in database
			session.getTransaction().commit();
		}
		
		finally
		{
			session.close();
			factory.close();
		}
		
	}

}
