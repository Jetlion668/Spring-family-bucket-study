package com.jetlion.dao;

import com.jetlion.entity.Course;
import jdk.internal.dynalink.beans.StaticClass;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CourseDAO {
    private Map<Integer, Course> courses = new HashMap<Integer, Course>();

    private static int index=0;


    public void add(Course course) {
        int id=index++;
        course.setId(id);
        courses.put(id, course);
    }

    public Collection<Course> getAll() {
        return courses.values();
    }

    public Course getById(int id) {
        return courses.get(id);
    }

    public void update(Course course) {
        courses.put(course.getId(), course);
    }

    public void deleteById(int id) {
        courses.remove(id);
    }
}