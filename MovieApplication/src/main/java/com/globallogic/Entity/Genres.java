package com.globallogic.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Genres_Table")
public class Genres {
    @Id
    @Column(name="genre_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}
