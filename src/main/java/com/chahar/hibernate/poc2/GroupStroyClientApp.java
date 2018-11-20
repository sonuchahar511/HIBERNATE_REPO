package com.chahar.hibernate.poc2;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GroupStroyClientApp {
	public static void main(String[] args) {
		Session session=null;
		try{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
			session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			Group group=new Group("lalu rabri band");
			group.setStories(new Story[] {new Story("Story name 1"),new Story("Story name 2")});
	//		student.setId(1); no effect even if you set some values in this field.. as you mention generator class="increment" in .hbm file.. 
			session.save(group);
			transaction.commit();
			
			transaction=session.beginTransaction();
			Group group1=(Group)session.load(Group.class, new Integer(1));
			
			System.out.println(group1);
			for(Story story:group1.getStories()) {
				System.out.println(story.getId()+" "+story.getInfo());
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			if(session!=null) {
				session.flush();
				session.close();
			}
		}
	}
}
