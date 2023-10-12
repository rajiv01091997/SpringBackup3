package com.globallogic.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Movie_Table")
public class Movies {
    @Id
    @Column(name="movie_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private int yearOfRelease;

    private Genres genres;

}
