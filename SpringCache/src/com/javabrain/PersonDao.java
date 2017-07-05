package com.javabrain;

import java.util.List;

public interface PersonDao {

	
	public Person getPersonOnIndex(String name, int i);
	
	public Person getPersonOnAge(int i);
	
	
 public	List<Person> getPersons();
}
