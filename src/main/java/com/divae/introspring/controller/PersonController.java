package com.divae.introspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.divae.introspring.model.Person;
import com.divae.introspring.repositories.PersonRepository;

@Controller
@RequestMapping("/index")
public class PersonController {

	@Autowired PersonRepository persons;
	
	@RequestMapping("/create")
	public String novo() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String create(Person person) {
		if (person.getFirstname().equals("firstname")) {
			System.out.println(">>>> wird nicht gespeichert");
		} else {
			persons.save(person);
			System.out.println(">>>> " + person.getFirstname());
		}
		return "danke";
	}

}
