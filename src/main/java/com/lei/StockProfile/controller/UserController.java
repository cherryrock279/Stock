package com.lei.StockProfile.controller;

import com.lei.StockProfile.model.PersonPersistence;
import com.lei.StockProfile.model.UserPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.lei.StockProfile.service.UserService;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    Logger log= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService=userService;
    }
   /* @RequestMapping(value="/register",method= RequestMethod.POST)
    public PersonPersistence createUser(@RequestBody PersonPersistence personObj){
        log.info("Name is :{}",personObj.getName());
        Set<UserPersistence> users=new HashSet<>();
        for(UserPersistence user:personObj.getUsers()){
            user.setPerson(personObj);
            users.add(user);
        }
        personObj.setUsers(users);
        return userService.creatPerson(personObj);
    }*/
    @RequestMapping(value="/find/{id}",method = RequestMethod.GET)
    public PersonPersistence findById(@PathVariable(name="id") int personId){
        return userService.findPersonById(personId);
    }
}
