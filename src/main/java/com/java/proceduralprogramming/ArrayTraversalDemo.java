package com.java.proceduralprogramming;

public class ArrayTraversalDemo {
    public static void main(String[] args) {
        // ALTERNATIVE ASSIGNMENT TO ARRAYS
        String[] products = new String[]{"rice", "chicken", "salt", "spices"};
//                                         0         1        2        3
//        System.out.println(products[1]); // RETRIEVE VALUE BY INDEX
        int[] prices = new int[]{15, 35, 5, 8};
        int average = 0;
//        System.out.println(prices[1]);
//        System.out.println(products.length);
        int totalPrice = 0;
        for(int i=0; i< products.length; i++) {
            totalPrice = totalPrice + prices[i];
        }
        average = totalPrice / prices.length;
        System.out.println("Your average meal cost is "+average);

    }
}
