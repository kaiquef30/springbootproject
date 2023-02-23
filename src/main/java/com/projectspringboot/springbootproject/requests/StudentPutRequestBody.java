package com.projectspringboot.springbootproject.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentPutRequestBody {

    private Long id;
    private String name;
}
