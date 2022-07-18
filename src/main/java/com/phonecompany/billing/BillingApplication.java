package com.phonecompany.billing;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.*;

@SpringBootApplication
public class BillingApplication {

        private static String currentFavourite;

        public static void main(String[] args) {
                System.out.println("\n ========================|PHONE-BILL CALCULATOR|===============================");
                System.out.println();
              
                chargesCalculator currentMonthlyBill = new chargesCalculator();
                ArrayList<String> phoneNumbers = new ArrayList<String>();
                ArrayList<Long> phoneDurations = new ArrayList<Long>();
                ArrayList<BigDecimal> phoneBillsOne = new ArrayList<BigDecimal>();

                currentMonthlyBill.extractNumbers(phoneNumbers, phoneDurations);
                currentMonthlyBill.extractFavourite(phoneNumbers, phoneDurations);
                currentMonthlyBill.displayBills(phoneDurations, phoneBillsOne);
                currentMonthlyBill.displayDiscounts(phoneBillsOne, phoneNumbers, currentFavourite);
        }
}
