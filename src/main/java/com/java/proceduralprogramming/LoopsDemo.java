package com.java.proceduralprogramming;

public class LoopsDemo {
    // 4 types of loops
    // for loop
    //     - for(<INITIALIZE A VARIABLE>; <CONDITION>; <INCREMENT / DECREMENT>) {
    //        ....
    //        .....
    //       }
    public static void main(String[] args) {
        // Pre-Increment (++i) , Post-increment (i++)
//        int i = 10;
//        System.out.println(++i);

//        for(int i=0; i<=100; i++) {
//            System.out.println(i);
//        }
//        for(int i = 100; i>=0; i--) {
//            System.out.println(i);
//        }

//        while(<CONDITION>) {
//        ....
//        ....
//        }
//        int i=0;
//        while(i<100) {
//            System.out.println(i);
//            i++;
//        }

//        do while loop - EXECUTES ATLEAST ONCE EVEN IF CONDITION IS FALSE
//        do {
//        ...
//        ...
//        }while(<CONDITION>)
        int i=101;
        do {
            System.out.println("Iterating "+i+" times");
            i++;
        }while(i<100);
    }
}
