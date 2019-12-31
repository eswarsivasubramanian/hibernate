package com.iprimed.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Cart;
import com.iprimed.bean.College;
import com.iprimed.bean.Items;
import com.iprimed.bean.NewStudent;

public class OneToManyMappingSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inbuild hibernate xml file using factory
				SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
						.addAnnotatedClass(Cart.class)
						.addAnnotatedClass(Items.class)
						.buildSessionFactory();
				
				//create session
				Session session = factory.getCurrentSession();
				
				try
				{
					//create objects
//					Cart ca=new Cart();
//					ca.setCartId(1);
//					ca.setCartName("Basket");
//					ca.setCartTotal(2);
//					
//					Items it1=new Items(101,200,1,ca);
//					Items it2=new Items(102,250,1,ca);
					
					
//					ca.getItems().add(it1);
//					ca.getItems().add(it2);
					
					
					
					//begin transaction
					session.beginTransaction();
					
					Items item = session.get(Items.class,101);
					System.out.println(item.getItemId());
					System.out.println(item.getItemQuantity());
					System.out.println(item.getItemTotal());
					System.out.println(item.getCart());
					
					System.out.println("*************************************");
					Cart cart = item.getCart();
					System.out.println(cart.getCartId());
					System.out.println(cart.getCartName());
					System.out.println(cart.getCartTotal());
					
					//save objects in db
//					session.save(ca);
//					session.save(it1);
//					session.save(it2);
//					
//					//commit changes in db
//					session.getTransaction().commit();
					
					
				}
				finally
				{
					session.close();
					factory.close();
				}

	}

}
