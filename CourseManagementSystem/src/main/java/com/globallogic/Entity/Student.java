package com.globallogic.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Student {
    @Id
    private int id;
    private String name;
    private String course;
    private String address;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Course> courseList;
    @OneToOne(mappedBy = "student",cascade=CascadeType.ALL)
    private FinalProject finalProject;


}
