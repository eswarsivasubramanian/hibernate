package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Department;
import com.iprimed.bean.Emp;
import com.iprimed.bean.Student;

public class OneToOneMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inbuild hibernate xml file using factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Department.class)
				.addAnnotatedClass(Emp.class)
				.buildSessionFactory();

		//create session
		Session session = factory.getCurrentSession();
		
		try
		{
			//create object
			Department dept = new Department(1001,"IT");
			Emp e = new Emp(1,"Eswar",25000,dept);
			
			//begin transaction
			session.beginTransaction();
			
			//save objects
			session.save(dept);
			session.save(e);
			
			//commit changes into db
			session.getTransaction().commit();
			
		}
		finally
		{
			session.close();
			factory.close();
		}

	}

}
