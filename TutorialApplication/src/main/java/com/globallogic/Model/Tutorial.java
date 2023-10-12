package com.globallogic.Model;

import jakarta.annotation.Generated;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Tutorial")
public class Tutorial {
@Id
private int id;
private String title;
private String description;
private String status;


}


