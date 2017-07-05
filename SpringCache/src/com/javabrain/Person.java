package com.javabrain;

import java.util.ArrayList;
import java.util.List;

public class Person{
	
	List<Person> plist = new ArrayList<>();
	
	void init() {
		plist.add(new Person("A",6));
		plist.add(new Person("B",2));
		plist.add(new Person("A",3));
	}
	
	
	
	 List<Person> getPersons(){
		 init();
		return plist;
	}
	
	String name;
	int age;
	
	public Person() {
	}
	
	public Person(String string, int i) {
		this.age =i;
		this.name = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}