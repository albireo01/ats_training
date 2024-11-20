package com.java.proceduralprogramming;

public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        // allows program to take decisions
        // if, else, else if
        // if(<CONDITION>) {
        // ...  WILL EXECUTE ONLY IF CONDITION ABOVE IS TRUE
        // ...
        // }
        int age = 19;
        if(age > 18) {
            System.out.println("Elligible to vote!");
        }else {
            System.out.println("Not Elligible to vote!");
        }
    }
}
