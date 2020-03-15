package com.yobuligo.DemoOpenID.Person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@GetMapping("/persons")
	public List<Person> getPersons() {
		Person person = new Person();
		person.setFirstname("Max");
		person.setLastname("Müller");

		List<Person> personList = new ArrayList();
		personList.add(person);
		return personList;
	}
}
