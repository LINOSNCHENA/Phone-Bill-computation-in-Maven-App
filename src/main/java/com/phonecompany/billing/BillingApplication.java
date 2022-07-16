package com.phonecompany.billing;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class BillingApplication {


	public static void main(String[] args) {
        System.out.println("Simple Calculator");
        System.out.println();
        TelephoneBillCalculator cal = new TelephoneBillCalculator();
	        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        cal.add(a, b);
        cal.mul(a, b);
        cal.sub(a, b);
        cal.div(a, b);
        sc.close();
}
}
