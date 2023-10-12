package com.globallogic.Dto;

import com.globallogic.Entity.Employee;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DepartmentDto {
    private int deptId;
    private String deptName;
    private List<Employee> employeeList;
}
