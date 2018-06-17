package com.arbor.swagger2;

import java.util.List;

public interface PersonService {
	List<Person> loadAll();

	boolean create(Person person);

	boolean deleteById(Long id);

	Person findById(Long id);

	boolean update(Person person);
}
