package com.globallogic.Dto;

import com.globallogic.Entity.Department;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDto {
    private int empId;
    private String firstName;
    private String lastName;
    private int brithDate;
    private long phone;
    private Department department;
}
