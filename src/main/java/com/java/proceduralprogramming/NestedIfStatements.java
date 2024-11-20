package com.java.proceduralprogramming;

public class NestedIfStatements {
    public static void main(String[] args) {
        String country = "Other";
        int age = 15;
        if(country == "India") {
            if(age > 18) {
                System.out.println("Elligible to vote in India!");
            }
        }else if(country == "Other") {
            System.out.println("....");
            if(age > 16) {
                System.out.println("Elligible to vote!");
            }
        }else {
            System.out.println("Invalid Input");
        }
    }
}
