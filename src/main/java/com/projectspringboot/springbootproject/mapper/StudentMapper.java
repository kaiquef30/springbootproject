package com.projectspringboot.springbootproject.mapper;


import com.projectspringboot.springbootproject.domain.Student;
import com.projectspringboot.springbootproject.requests.StudentPostRequestBody;
import com.projectspringboot.springbootproject.requests.StudentPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class StudentMapper {

    public static final StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
    public abstract Student toStudent(StudentPostRequestBody studentPostRequestBody);
    public abstract Student toStudent(StudentPutRequestBody studentPutRequestBody);

}
