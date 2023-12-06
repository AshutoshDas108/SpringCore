package com.Annotations1_0;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;


public class College
{
    private String collegeName;
    private Principal principal;
    private Teacher teacher;


    @Value("JAVA PROGRAMMING WORLD")
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void collegeInfo(){
        System.out.println("college name :" + collegeName);
        principal.aboutPrincipal();
        teacher.teach();
    }
}
