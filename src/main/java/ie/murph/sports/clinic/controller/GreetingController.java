package ie.murph.sports.clinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ie.murph.sports.clinic.domain.Greeting;
import ie.murph.sports.clinic.entity.PersonEntity;
import ie.murph.sports.clinic.repository.PersonRepository;

@Controller
public class GreetingController {

	@Autowired
	PersonRepository personRepository;
	
    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }
    
    @RequestMapping(value="/person", method=RequestMethod.GET)
    public String personForm(Model model) {
    	model.addAttribute("person", new PersonEntity());
        return "person";
    }
    
    @RequestMapping(value="/person", method=RequestMethod.POST)
    public String personSubmit(@ModelAttribute PersonEntity personEntity, Model model) {
  	  	personRepository.save(personEntity);
        return "home";
    }

}
