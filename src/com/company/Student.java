package com.company;

/**
 * Created by bb222 on 10/5/18.
 */
public class Student {
        String name;
        Double GPA;
        public int numOfStudents = 0;
    public Student(String name, Double GPA){
        this.name = name;
        this.GPA = GPA;
        numOfStudents++;
    }



}
