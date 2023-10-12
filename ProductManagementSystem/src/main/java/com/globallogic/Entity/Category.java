package com.globallogic.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Category {
    @Id
    private int categoryId;
    private String category;

    @OneToMany(mappedBy = "category")
    @JsonBackReference
    private List<Product> products;
}
