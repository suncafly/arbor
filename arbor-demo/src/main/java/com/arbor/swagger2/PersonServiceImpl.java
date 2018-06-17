package com.arbor.swagger2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.AssertTrue;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> loadAll() {
		return personRepository.findAll();
	}

	@Override
	public boolean create(Person person) {
		personRepository.save(person);
		if(personRepository.findOne(person.getId()).getId() == person.getId()){
			return true;
		}

		return true;
	}

	@Override
	public boolean deleteById(Long id) {
		personRepository.delete(id);
		if(personRepository.findOne(id) == null){
			return true;
		}
		return false;
	}

	@Override
	public Person findById(Long id) {
		return personRepository.findOne(id);
	}

	@Override
	public boolean update(Person person) {
		personRepository.save(person);
		return true;
	}


}
