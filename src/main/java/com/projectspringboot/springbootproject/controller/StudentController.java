package com.projectspringboot.springbootproject.controller;


import com.projectspringboot.springbootproject.domain.Student;
import com.projectspringboot.springbootproject.requests.StudentPostRequestBody;
import com.projectspringboot.springbootproject.requests.StudentPutRequestBody;
import com.projectspringboot.springbootproject.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> list(){
       return ResponseEntity.ok(studentService.listAll());
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<Student> findById(long id){
        return ResponseEntity.ok(studentService.findByIdOrThrowBadRequestException(id));
    }

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody StudentPostRequestBody studentPostRequestBody){
       return new ResponseEntity<>(studentService.save(studentPostRequestBody), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody StudentPutRequestBody studentPutRequestBody){
        studentService.replace(studentPutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
