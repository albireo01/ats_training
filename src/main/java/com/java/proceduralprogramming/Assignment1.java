package com.java.proceduralprogramming;

public class Assignment1 {
    // SUPER MART
    // CUSTOMER TYPE = Gold, silver, platium
    // if BILL_AMOUNT > 5000 and CUSTOMER TYPE = silver - 5% discount
    // if BILL_AMOUNT > 1000 and CUSTOMER TYPE = gold - 10% discount
    // if BILL_AMOUNT > 15000 and CUSTOMER TYPE = platium - 15% discount
    // print total bill amount
    public static void main(String[] args) {
        int billAmount = 6000;
        String customerType = "Silver";
        if(billAmount > 5000) {
            if(customerType == "Silver") {
                System.out.println("Discounted Bill is "+(billAmount - (0.05 * billAmount)));
            }else {
                System.out.println("Bill Amount : "+billAmount);
            }
        }
    }
}
