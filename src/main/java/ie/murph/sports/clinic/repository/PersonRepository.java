package ie.murph.sports.clinic.repository;

import org.springframework.data.repository.CrudRepository;

import ie.murph.sports.clinic.entity.PersonEntity;

public interface PersonRepository extends CrudRepository<PersonEntity, Long>{

}
