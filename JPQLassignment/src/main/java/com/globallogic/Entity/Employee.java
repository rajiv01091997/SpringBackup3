package com.globallogic.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    private int empId;
    private String firstName;
    private String lastName;
    private int brithDate;
    private long phone;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="deptId")
    @JsonBackReference
    private Department department;
}
