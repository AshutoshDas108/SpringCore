package com.SpringDependencyInjection;

public class Student
{

   private String studentName;
   private int id;

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void show(){
        System.out.println("Student Name : " + studentName + " and Student Id: " + id );
    }
}
