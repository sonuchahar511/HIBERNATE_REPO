package com.chahar.hibernate.poc1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentClientApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		Student student=new Student();
//		student.setId(1); no effect even if you set some values in this field.. as you mention generator class="increment" in .hbm file.. 
		student.setName("manish");
		session.save(student);
		transaction.commit();
		
		transaction=session.beginTransaction();
		Student student1=(Student)session.load(Student.class, new Integer(3));
		System.out.println(student1);
		
	}
}
