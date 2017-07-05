package com.javabrain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class SpringCache {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		PersonDao personDao = (PersonDao) context.getBean("personDaoImpl");
		

	Person p1 = personDao.getPersonOnIndex("A",0);
	System.out.println(p1);
	Person p2 = personDao.getPersonOnIndex("A",2);
	System.out.println(p2);
	
	
	
	}
}


