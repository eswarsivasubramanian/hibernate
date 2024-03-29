package com.iprimed.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;

public class GetCustomer {

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
			int custId=3;
			
			//begin transaction
			session.beginTransaction();
			System.out.println("transaction started");
			
			//get customer details
			//Customer customer=session.get(Customer.class,custId);
			//get all customer details
//			List<Customer> customers = session.createQuery("from Customer").getResultList();
			
			
			
			//List<Customer> customers = session.createQuery("from Customer where email='eswar@gmail.com'").getResultList();
			
			//ending like i
//			List<Customer> customers1 = session.createQuery("from Customer c where c.name LIKE '%i'").getResultList();

			
			//ending like a or i
//			List<Customer> customers2 = session.createQuery("from Customer c where c.name LIKE '%i' OR c.name LIKE '%a'").getResultList();//Customer is bean class name
			
			//List<Customer> customers2 = session.createQuery("from Customer where email='eswar@gmail.com'").getResultList();
			
			List<Customer> customers2 = session.createQuery("from Customer c where c.name LIKE '%e%'").getResultList();
			
			//			int res = session.createQuery("update Customer set email='test@yahoo.co.in'").executeUpdate();
//			System.out.println("updated customer email address");
			
			//print customer details
			//System.out.println(customer.getName()+" : "+customer.getEmail()+" : "+customer.getMobile());
			
			/*for(Customer c:customers)
			{
				System.out.println(c.getName());
			}
			*/
			
//			Iterator<Customer> itr=customers.iterator();
//			while(itr.hasNext())
//			{
//				Customer c = itr.next();
//				System.out.println(c.getName()+" : "+c.getId());
//			}
			
//			Iterator<Customer> itr=customers1.iterator();
//			while(itr.hasNext())
//			{
//				Customer c = itr.next();
//				System.out.println(c.getName()+" : "+c.getId());
//			}
			
			Iterator<Customer> itr=customers2.iterator();
			while(itr.hasNext())
			{
				Customer c = itr.next();
				System.out.println(c.getName()+" : "+c.getId()+" : "+c.getEmail());
			}
			
			
		}
		
		finally
		{
			session.close();
			factory.close();
		}

	}

}
