package com.globallogic.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class FinalProject {
    @Id
    private int projectId;
    private String projectName;
    private String domain;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="student_fk",referencedColumnName = "id")
    private Student student;

}
