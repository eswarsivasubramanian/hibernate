package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Department;
import com.iprimed.bean.Emp;

public class BidirectionalMapping {
	

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
//			Department dept = new Department();
//			dept.setDeptId(1002);
//			dept.setDeptName("Admin");
//			
//			Emp e = new Emp();
//			e.setEmpId(2);
//			e.setEmpName("Siva");
//			e.setSalary(20000);
//			
//			
//			e.setDepartment(dept);
				
			//begin transaction
			session.beginTransaction();
				
				Emp emp = session.get(Emp.class,2); //2 is employee id
				System.out.println(emp.getEmpName());
				System.out.println(emp.getEmpId());

				System.out.println(emp.getDepartment());
				
				Department dept1 = emp.getDepartment();
				System.out.println(dept1.getDeptName());
				System.out.println(dept1.getDeptId());
				
				System.out.println("**************************************");
		
				//retrieving employee and department details using department
				Department de = session.get(Department.class, 1002);
				System.out.println(de.getDeptId());
				System.out.println(de.getDeptName());
				System.out.println(de.getEmp());
			
				Emp em = de.getEmp();
				System.out.println(em.getEmpId());
				System.out.println(em.getEmpName());
				System.out.println(em.getSalary());
			
				//save objects
				//session.save(dept);
				//session.save(e);
				
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



