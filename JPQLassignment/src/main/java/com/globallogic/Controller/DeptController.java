package com.globallogic.Controller;

import com.globallogic.Entity.Department;
import com.globallogic.Repository.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp/")
public class DeptController {
    @Autowired
    private DeptRepo deptRepo;
    @PostMapping("add")
    public Department save(@RequestBody Department department)
    {
       return deptRepo.save(department);
    }
}
