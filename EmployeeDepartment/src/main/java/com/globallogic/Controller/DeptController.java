package com.globallogic.Controller;

import com.globallogic.Entity.Department;
import com.globallogic.Repo.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dept/")
public class DeptController {

    @Autowired
    private DeptRepo deptRepo;


//    @PostMapping("add")
//    public Department save(@RequestBody Department department)
//    {
//        return deptRepo.save(department);
//    }
//    @GetMapping("get/{id}")
//    public Department get(@PathVariable int id)
//    {
//        return deptRepo.findById(id).get();
//    }

}
