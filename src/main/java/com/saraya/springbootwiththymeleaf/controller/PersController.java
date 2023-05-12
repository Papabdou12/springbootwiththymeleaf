package com.saraya.springbootwiththymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.springbootwiththymeleaf.model.Person;
import com.saraya.springbootwiththymeleaf.service.PersonService;

@Controller
public class PersController {
	
	PersonService service = new PersonService();
	Person pers = new Person();
	
	

	@RequestMapping("/")
	public String Home(ModelMap model) {
		model.put("pers", pers);
		return "index";
	}
	
	@RequestMapping( method= RequestMethod.POST)
	
	public String CreatePers(@RequestParam("firstname") String firstname,
			 @RequestParam("lastname") String lastname, ModelMap model) {
		service.createPerson(firstname, lastname);
		return "redirect:/";
	}
@RequestMapping(value="/addPerson",  method = RequestMethod.GET)
	
	public String CreatePers()
	{
	return "addPerson";
	}
	
@RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
public String personList(ModelMap model) {

	model.addAttribute("pers", pers);

	return "personList";
}
	}

	

	

