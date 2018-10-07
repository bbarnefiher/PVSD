package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("student1", 4.0);
        Student student2 = new Student("student2", 2.0);
        Student student3 = new Student("student3", 3.0);

        double[] studentGPA = new double[3];
        String[] studentRank = new String[3];

        studentGPA[0] = student1.GPA;
        studentGPA[1] = student2.GPA;
        studentGPA[2] = student3.GPA;
        Arrays.sort(studentGPA);



        if (student1.GPA == studentGPA[0]){
            studentRank[0] = student1.name;}
        else if (student1.GPA == studentGPA[1]){
            studentRank[1] = student1.name;}
        else if (student1.GPA == studentGPA[2]){
            studentRank[2] = student1.name;}

        if (student2.GPA == studentGPA[0]){
            studentRank[0] = student2.name;}
        else if (student2.GPA == studentGPA[1]){
            studentRank[1] = student2.name;}
        else if (student2.GPA == studentGPA[2]){
            studentRank[2] = student2.name;}

        if (student3.GPA == studentGPA[0]){
            studentRank[0] = student3.name;}
        else if (student3.GPA == studentGPA[1]){
            studentRank[1] = student3.name;}
        else if (student3.GPA == studentGPA[2]){
            studentRank[2] = student3.name;}

        System.out.println("The top three students are:");
        System.out.println("1. " + studentRank[2]);
        System.out.println("2. " + studentRank[1]);
        System.out.println("3. " + studentRank[0]);


    }
}
