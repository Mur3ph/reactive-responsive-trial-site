package ie.murph.sports.clinic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ie.murph.sports.clinic.domain.Person;
import ie.murph.sports.clinic.entity.PersonEntity;
import ie.murph.sports.clinic.repository.PersonRepository;
import ie.murph.sports.clinic.service.PersonService;

@SpringBootApplication
public class SportsClinicApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(SportsClinicApplication.class);
	  
	  @Autowired
	  PersonService personService;
	  
	  @Autowired
	  PersonRepository personRepository;
	  
	  public void run(String... args) {
	    Person person = new Person();
	    person.setFirstName("FName");
	    person.setLastName("LName");
	    person.setAge(20);
	    person.setPlace("Place");
	    
	    if ( personService.addPerson(person) > 0){
	      logger.info("Person saved successfully");
	    }
	    
	    for(Person p : personService.getAllPerson()){
	      logger.info(p.toString());
	    }
	    
	    logger.info("Using JPA for insert and find");
	    PersonEntity personEntity = new PersonEntity("fName2", "lName2", 24, "Bangalore");
	    personEntity = personRepository.save(personEntity);
	    logger.info("Person with ID: " + personEntity.getId() + " saved successfully");
	    
	    for ( PersonEntity pEntity : personRepository.findAll()){
	      logger.info(pEntity.toString());
	    }
	  }
	
	public static void main(String[] args) {
		SpringApplication.run(SportsClinicApplication.class, args);
	}
}
