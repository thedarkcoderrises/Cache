package com.javabrain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class SpringCache {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		PersonDao personDao = (PersonDao) context.getBean("personDaoImpl");
		

	Person p1 = personDao.getPersonOnIndex("A",0);
	Person p2 = personDao.getPersonOnIndex("A",2);

	if(p1==p2){
		System.out.println("Cached on name");
	}else{
		System.out.println("unique");
	}
	
	p1 = personDao.getPersonOnAge(20);
	p2 = personDao.getPersonOnAge(20);
	
	if(p1==p2){
		System.out.println("Cached on age");
	}else{
		System.out.println("unique");
	}
	
	}
}


