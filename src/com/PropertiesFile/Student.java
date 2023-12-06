package com.PropertiesFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNullFields;

public class Student {
    private String name;
    private String interestedCourses;
    private String hobby;


    @Value("${student.name}")
    public void setName(String name) {
        this.name = name;
    }

    @Value("${student.interestedCourse}")
    public void setInterestedCourses(String interestedCourses) {
        this.interestedCourses = interestedCourses;
    }

    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo(){
        System.out.println("Name:" + name + "\nCourse:" + interestedCourses + "\nHobby:" + hobby);
    }
}
