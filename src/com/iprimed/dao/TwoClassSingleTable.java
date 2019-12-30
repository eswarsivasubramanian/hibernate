package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Employee;
import com.iprimed.bean.EmployeeDetails;

public class TwoClassSingleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inbuild hibernate xml file using factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(EmployeeDetails.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try
		{
			//create employee details object
			EmployeeDetails empDetails = new EmployeeDetails(22,"Chennai");
			
			//create employee object
			Employee emp = new Employee();
			emp.setEmpId(1001);
			emp.setName("Eswar");
			emp.setSalary(25000);
			emp.setEmpDetails(empDetails);
			
			//begin transaction
			session.beginTransaction();
			
			//save employee object
			session.save(emp);
			
			//commit employee object
			session.getTransaction().commit();
		}
		finally
		{
			session.close();
			factory.close();
		}
	}
}
