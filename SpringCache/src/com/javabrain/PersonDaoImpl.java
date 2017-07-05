package com.javabrain;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository("personDaoImpl")
public class PersonDaoImpl implements PersonDao {

	Person per = new Person();
	
	@Override
	@Cacheable(value = { "test" }, key="#name")
	public Person getPersonOnIndex(String name, int index){
		return per.getPersons().get(index);
	}

	@Override
	public List<Person> getPersons() {
		return per.getPersons();
	}
}
