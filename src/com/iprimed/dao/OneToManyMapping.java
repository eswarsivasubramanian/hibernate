package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.College;
import com.iprimed.bean.NewStudent;

public class OneToManyMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inbuild hibernate xml file using factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(College.class)
				.addAnnotatedClass(NewStudent.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try
		{
			//create objects
			//College col = new College();
			//col.setCollegeId(1000);
			//col.setCollegeName("Sairam");
			
			//NewStudent ns = new NewStudent(101,"Eswar",col);
			//NewStudent ns1 = new NewStudent(102,"Siva",col);
//			col.setNewstudent(ns);
//			col.setNewstudent(ns1);
			
			
			//add students to college
			//col.getStudent().add(ns);
			//col.getStudent().add(ns1);
			
			//begin transaction
			session.beginTransaction();
			
			NewStudent student = session.get(NewStudent.class, 101);
			System.out.println(student.getName());
			System.out.println(student.getRollNo());
			System.out.println(student.getCollege());
			
			System.out.println("*************************************");
			College college = student.getCollege();
			System.out.println(college.getCollegeId());
			System.out.println(college.getCollegeName());
			
			
			//save objects in db
			//session.save(col);
			//session.save(ns);
			//session.save(ns1);
			
			//commit changes in db
			//session.getTransaction().commit();
		}
		finally
		{
			session.close();
			factory.close();
		}
	}
}
