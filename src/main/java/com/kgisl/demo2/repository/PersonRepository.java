package com.kgisl.demo2.repository;
 
 
import org.springframework.data.repository.ListCrudRepository;
 
import com.kgisl.demo2.entity.Person;
 
public interface PersonRepository extends ListCrudRepository<Person, Long> {
}