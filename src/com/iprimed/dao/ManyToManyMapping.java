package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Delegate;
import com.iprimed.bean.Event;

public class ManyToManyMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inbuild hibernate xml file using factory
				SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
						.addAnnotatedClass(Delegate.class)
						.addAnnotatedClass(Event.class)
						.buildSessionFactory();
				
				//create session
				Session session = factory.getCurrentSession();
				
				try
				{
					//create objects
					Delegate del1 = new Delegate();
					del1.setDelegateId(101);
					del1.setDelegateName("Delegate 1");
					
					Delegate del2 = new Delegate();
					del2.setDelegateId(102);
					del2.setDelegateName("Delegate 2");
					
					Delegate del3 = new Delegate();
					del3.setDelegateId(105);
					del3.setDelegateName("Delegate 3");
					
					Delegate del4 = new Delegate();
					del3.setDelegateId(104);
					del3.setDelegateName("Delegate 4");
					
					Event ev1 = new Event();
					ev1.setEventId(501);
					ev1.setEventName("Event 1");
					
					Event ev2 = new Event();
					ev2.setEventId(502);
					ev2.setEventName("Event 2");
					
					Event ev3 = new Event();
					ev3.setEventId(503);
					ev3.setEventName("Event 3");
					
					del1.getEvent().add(ev1);
					del2.getEvent().add(ev2);
					del3.getEvent().add(ev3);
					del4.getEvent().add(ev1);
					
					ev1.getDelegate().add(del1);
					ev1.getDelegate().add(del4);
					ev2.getDelegate().add(del2);
					ev3.getDelegate().add(del3);
					
					//begin transaction
					session.beginTransaction();
					
					//save objects in db
					session.save(del1);
					session.save(del2);
					session.save(del3);
					session.save(del4);
					session.save(ev1);
					session.save(ev2);
					session.save(ev3);
					
					//commit changes in db
					session.getTransaction().commit();	
				}
				finally
				{
					session.close();
					factory.close();
				}
	}
}
