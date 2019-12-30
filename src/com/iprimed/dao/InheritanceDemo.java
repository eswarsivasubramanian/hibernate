package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Child;
import com.iprimed.bean.GrandChild;
import com.iprimed.bean.Parent;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inbuild hibernate xml file using factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Parent.class)
				.addAnnotatedClass(Child.class)
				.buildSessionFactory();
		
		//create session
				Session session = factory.getCurrentSession();
				
				try
				{
					//create parent,child and grandchild objects
					Parent p = new Parent();
					p.setParentId(1001);
					p.setParentName("Parent 1");
					
					Child c = new Child();
					c.setParentId(1002);
					c.setParentName("Parent 2");
					c.setChildId(2001);
					c.setChildName("Child 1");
					
					GrandChild gc = new GrandChild();
					gc.setParentId(1003);
					gc.setParentName("Parent 3");
					gc.setChildId(2002);
					gc.setChildName("Child 2");
					gc.setGrandchildId(3001);
					gc.setGrandchildName("grandchildName 1");
					
					//begin transaction
					session.beginTransaction();
					
					//save objects
					session.save(p);
					session.save(c);
					session.save(gc);
					
					//commit changes to db
					session.getTransaction().commit();
				}
				finally
				{
					session.close();
					factory.close();
				}
	}
}
