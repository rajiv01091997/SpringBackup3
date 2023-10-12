package com.globallogic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Entity.Person;
import com.globallogic.Repository.Repo;

@RestController
@RequestMapping("/api")
public class controller {
    @Autowired
	private Repo repo;
	
    @PostMapping("/post")
    public Person savePerson(@RequestBody  Person person)
    {
    	return repo.save(person);
    }
    
    @GetMapping("/getit")
    public List<Person> getPersons()
    {
    	return repo.findAll();
    }
    
    @GetMapping("/get")
    public String getMsg()
    {
    	return "hi there";
    }
}
