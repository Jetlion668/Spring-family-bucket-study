package com.southwind.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.southwind.entity.Student;

public class StudentValidator implements Validator{

    public boolean supports(Class<?> clazz) {
        // TODO Auto-generated method stub
        return Student.class.equals(clazz);
    }

    public void validate(Object target, Errors errors) {
        // TODO Auto-generated method stub
        ValidationUtils.rejectIfEmpty(errors, "name", null, "姓名不能为空"); 
        ValidationUtils.rejectIfEmpty(errors, "password", null, "密码不能为空");
    }

}