package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;
import com.iprimed.bean.Student;

public class SingleClassTwoTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inbuild hibernate xml file using factory
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
		
				//create session
				Session session = factory.getCurrentSession();
				
				try
				{
					
					//create object
					Student st1 = new Student();
					st1.setStuName("Eswar");
					st1.setAge(20);
					st1.setSchoolName("Prince MHSS");
					
					
					
					//begin transaction
					session.beginTransaction();
					
					
					//save object
					session.save(st1);
					
					//commit object
					session.getTransaction().commit();
					
				}
				finally
				{
					session.close();
					factory.close();
				}

	}

}
