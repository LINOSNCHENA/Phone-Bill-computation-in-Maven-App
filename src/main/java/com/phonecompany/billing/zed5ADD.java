package com.phonecompany.billing;

import java.math.BigDecimal;

public class zed5ADD {
    public static void main(String[] args) {
        // BigDecimal object to store result
        BigDecimal totalBilling;
        System.out.println("===================|09-ADDITION|=================");

        // Holds the values to calculate the difference
        String input1 = "545456468445645468464645";
        String input2 = "425645648446468486486452";

        // Convert the string input to BigDecimal
        BigDecimal a = new BigDecimal(input1);
        BigDecimal b = new BigDecimal(input2);

        // Using subtract() method
        totalBilling = a.subtract(b);

        // Display the result in BigDecimal
        System.out.println("The difference of\n"
                + a + " \nand\n" + b + " "
                + "\nis\n" + totalBilling + "\n");
        System.out.println("===================|26-ADDITION|=================");
    }
}
