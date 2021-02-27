package com.jatin;

import java.util.Date;

public class Sample
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student s1 = new Student(1, "Jatin", "Bhola", new Date("1 Feb 1995"), Gender.MALE,
                "123 Mill Street", "Kitchener", "N2M3P7", "+12268995536",
                "bholajatin88@gmail.com", "CSAT", new float[] {90.5f,95.5f,96.5f,97.7f});
        s1.calculateTotalMarks();
        s1.calculatePercentage();
        s1.calculateGrade();
        System.out.println(s1.getTotalMarks());
        System.out.println(s1.getPercentage());
        System.out.println(s1.getGrade());
        System.out.println(s1.getGradePoint());
    }
}