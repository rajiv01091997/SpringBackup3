package com.globallogic.Controller;

import com.globallogic.Entity.Student;
import com.globallogic.Repo.StudentRepo;
import com.globallogic.Service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class Rcontroller {
    @Autowired
private ServiceImpl service;
    @Autowired
    private StudentRepo studentRepo;
    @PostMapping("/add")
public ResponseEntity<Student> addStudent(@RequestBody Student student)
{
    return new ResponseEntity<>(service.addStudent(student), HttpStatus.OK);
}
@DeleteMapping("/del/{id}")
        public String DeleteById(@PathVariable int id)
{
    studentRepo.deleteById(id);
    return "Deleted";
}

@GetMapping("/get/{id}")
    public ResponseEntity<Student> getWithId(@PathVariable int id)
{
    return new ResponseEntity<>(studentRepo.findById(id).get(),HttpStatus.OK);
}

}
