package com.chahar.hibernate.poc2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
			group.setStories(new Story[] {new Story("Story array 3"),new Story("Story array 4")});
			List<Story> list=new ArrayList<Story>();
			list.add(new Story("Story List 3"));
			list.add(new Story("Story List 4"));
			group.setList_stories(list);
	//		student.setId(1); no effect even if you set some values in this field.. as you mention generator class="increment" in .hbm file.. 
			
			Set<Story> hashSet=new HashSet<Story>();
			hashSet.add(new Story("Set Story 1"));
			hashSet.add(new Story("Set Story 2"));
			group.setSet_Stories(hashSet);
			session.save(group);
			transaction.commit();
			
			transaction=session.beginTransaction();
			Group group1=(Group)session.load(Group.class, new Integer(1));
			
			System.out.println(group1);
			/*for(Story story:group1.getStories()) {
				System.out.println(story.getId()+" "+story.getInfo());
			}*/
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
