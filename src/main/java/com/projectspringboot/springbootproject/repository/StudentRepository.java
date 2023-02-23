package com.projectspringboot.springbootproject.repository;

import com.projectspringboot.springbootproject.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Long> {



}
