package com.globallogic.Service;

import com.globallogic.Dto.DepartmentDto;
import com.globallogic.Entity.Department;
import com.globallogic.Repository.DeptRepo;
import com.globallogic.Repository.EmpRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class DeptService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private DeptRepo deptRepo;
    @Autowired
    private EmpRepo empRepo;
    public DepartmentDto save(DepartmentDto departmentDto)
    {
        Department department=modelMapper.map(departmentDto,Department.class);
        Department saved=deptRepo.save(department);
        return modelMapper.map(saved,DepartmentDto.class);
    }

}
