package com.globallogic.Controller;

import com.globallogic.Entity.Department;
import com.globallogic.Entity.Employee;
import com.globallogic.Repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("emp/")
public class EmpController {

    @Autowired
    private EmpRepo empRepo;
    @GetMapping("get/{id}")
    public Employee get(@PathVariable int id)
    {
        return empRepo.findById(id).get();
    }
    @GetMapping()
    public List<Employee> getall()
    {
       return empRepo.findAll();
    }
    @PostMapping("add")
    public Employee save(@RequestBody Employee emp)
    {
        return empRepo.save(emp);
    }

    @DeleteMapping("del/{id}")
    public String del(@PathVariable int id)
    {   empRepo.deleteById(id);
        return "Deleted";
    }

    @PutMapping("{id}")
    public Employee update(@PathVariable int id,@RequestBody Employee employee)
    {
        Employee emp=empRepo.findById(id).get();
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setCellPhone(employee.getCellPhone());
        emp.setBirthDate(employee.getBirthDate());
        Department dept=new Department();
        dept.setDeptId(employee.getDepartment().getDeptId());
        dept.setDeptName(employee.getDepartment().getDeptName());
        emp.setDepartment(dept);
//        emp.setDepartment(employee.getDepartment());
        return empRepo.save(emp);
    }
}
