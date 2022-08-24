package com.hibernatePractice;

//import com.practice.products;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Sample {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(products.class);
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		
		products data = new products();
		data.setProductID(10);
		data.setProductName("BallPointPen");
		s.save(data);
		
		t.commit();
		s.close();
		System.out.println("Done!!!");
	}
}
