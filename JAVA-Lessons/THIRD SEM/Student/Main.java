package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Roberto";
        student.age = 21;
        student.program = "BSCS-ML";
        student.yearLevel = "1st year";
        student.course = "OOP";
        student.displayStudentInfo();
    }
}
