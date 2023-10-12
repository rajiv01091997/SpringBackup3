package com.globallogic.Entity;



import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Department implements Serializable {
    @Id
    private int deptId;
    private String deptName;

//
//    @OneToOne(cascade = CascadeType.ALL)
//    private Employee employee;


//    @OneToMany(cascade = CascadeType.ALL)
//     @JoinColumn
//    private List<Employee> employee;
}
