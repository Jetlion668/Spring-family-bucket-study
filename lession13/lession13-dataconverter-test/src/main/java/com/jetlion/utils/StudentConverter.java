package com.jetlion.utils;

import org.springframework.core.convert.converter.Converter;

import com.jetlion.entity.Student;

public class StudentConverter implements Converter<String,Student>{

    @Override
    public Student convert(String source) {
        // TODO Auto-generated method stub
        String[] args = source.split("-");
        Student student = new Student();
        student.setId(Integer.parseInt(args[0]));
        student.setName(args[1]);
        student.setAge(Integer.parseInt(args[2]));
        return student;
    }

}