package com.java.proceduralprogramming;

public class OperatorsDemo {
    // Mathematical Operators - +, -, *, /, % (Used to calculate the remainder)
    // Shift Operators - <<, >> NOT REQUIRED
    // Logical Operators - And (&&), OR (||), NOT (!)
    // Ternary Operators / Ternary Expressions // SHORTHAND NOTATION FOR IF ELSE
    public static void main(String[] args) {
        int a = 15;
        int b = 21;
        String color = "GREEN";
        // MATHEMATICAL
        System.out.println("Sum : "+(a+b));
        System.out.println("Remainder : "+(b%a));

        // LOGICAL
        if(b > 23 && color == "GREEN") {
            System.out.println("Hi! it's time to cross the road!");
        }else if (b<23 && color == "RED") {
            System.out.println("Stop Please!");
        }else if (a > 10 || color == "RED") {
            System.out.println("Yes! it works!");
        }

        // TERNARY OPERATORS
        // variable = condition ? "value if true" : "value if false"
        color = b > 30 ? "GREEN" : "RED";
        System.out.println(color);
    }

}
