package com.Annotations2_0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class College
{
    private String collegeName;
    private Principal principal;
    private Teacher teacher;

    @Value("JAVA")
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Autowired
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    @Autowired
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void collegeInfo(){
        System.out.println("college name is :" + collegeName);
        principal.principalInfo();
        teacher.teach();
    }
}
