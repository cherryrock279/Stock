package com.lei.StockProfile.service;

import com.lei.StockProfile.model.PersonPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lei.StockProfile.repository.PersonRepository;

@Service
public class UserService {
    @Autowired
    PersonRepository personRepository;
    Logger log= LoggerFactory.getLogger(UserService.class);

   /* public PersonPersistence creatPerson(PersonPersistence personObj) {
        return (PersonPersistence) personRepository.save(personObj);
    }*/
    public PersonPersistence findPersonById(int id){
        return (PersonPersistence) personRepository.findOne(id);
    }
}
