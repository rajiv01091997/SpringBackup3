package com.globallogic.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Course {
    @Id
    private int courseId;
    private String courseName;
    private String courseDuration;
    private double courseFee;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="student_fk",referencedColumnName = "id")
    private Student student;

}
