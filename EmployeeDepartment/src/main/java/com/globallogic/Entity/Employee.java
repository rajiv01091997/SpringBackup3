package com.globallogic.Entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Employee implements Serializable {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    private String firstName;
    private String lastName;
    private int birthDate;
    private int cellPhone;

    @OneToOne(cascade = CascadeType.ALL)
    private Department department;

}
