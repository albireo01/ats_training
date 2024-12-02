package com.java.proceduralprogramming;

public class MultiDimensionalArraysDemo {
    public static void main(String[] args) {
        // name | email | phone | marks
        // mandeep | mandeep@test.com | 382138213 | 85
        // sid | sid@test.com | 128309218 | 80
        String[][] students = new String[][] {
                {"name", "email", "phone", "marks"}, // 0
//                 0        1        2        3
                {"mandeep", "mandeep@test.com", "21321331213", "85", "Good Student"}, // 1
//                 0              1                 2            3
                {"sid", "sid@test.com", "80938420924", "80", "Needs Improvement!"} // 2
//                 0              1           2          3
        };
//        System.out.println(students[2][2]);
        for(int i=0; i<students.length; i++) {
//            System.out.println(students[i][0]);
            for(int j=0; j<students[i].length; j++) {
                System.out.println(students[i][j]);
            }
        }
    }
}
