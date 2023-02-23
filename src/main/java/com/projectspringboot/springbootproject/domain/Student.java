package com.projectspringboot.springbootproject.domain;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "phonk")
@Builder
public class Student {

    @Id
    private Long id;
    private String name;
    private int age;


}
