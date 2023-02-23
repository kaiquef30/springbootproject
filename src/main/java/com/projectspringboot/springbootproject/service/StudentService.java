package com.projectspringboot.springbootproject.service;

import com.projectspringboot.springbootproject.domain.Student;
import com.projectspringboot.springbootproject.mapper.StudentMapper;
import com.projectspringboot.springbootproject.repository.StudentRepository;
import com.projectspringboot.springbootproject.requests.StudentPostRequestBody;
import com.projectspringboot.springbootproject.requests.StudentPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> listAll(){
        return studentRepository.findAll();
    }

 public Student findByIdOrThrowBadRequestException(long id){

        return studentRepository.findById(id)
                .orElseThrow();
 }

    public Student save(StudentPostRequestBody studentPostRequestBody) {
        return studentRepository.save(StudentMapper.INSTANCE.toStudent(studentPostRequestBody));

    }

    public void delete(long id) {
       studentRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(StudentPutRequestBody studentPutRequestBody) {
       Student studentSaved = findByIdOrThrowBadRequestException(studentPutRequestBody.getId());
        Student student = StudentMapper.INSTANCE.toStudent(studentPutRequestBody);
        student.setId(studentSaved.getId());
        studentRepository.save(student);
    }
}
