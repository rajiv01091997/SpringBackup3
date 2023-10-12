package com.globallogic.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.PathVariable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private int price;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="category")
    //@JsonManagedReference
    private Category category;
}
