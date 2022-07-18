package com.phonecompany.billing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

interface TelephoneBillsOneCalculator {
	SimpleDateFormat xChangerZ = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss", Locale.ENGLISH);

	// public and abstract
	ArrayList<String> extractNumbers(ArrayList<String> list, ArrayList<Long> list1);

	Object extractFavourite(ArrayList<String> list, ArrayList<Long> list1);

	ArrayList<BigDecimal> displayBills(ArrayList<Long> list, ArrayList<BigDecimal> list1);

	ArrayList<BigDecimal> displayDiscounts(ArrayList<BigDecimal> list, ArrayList<String> list1, String list2);
}

// implementation of the interface.
class chargesCalculator implements TelephoneBillsOneCalculator {

	private static String currentFavourite;

	ArrayList<BigDecimal> phoneBillsTwo = new ArrayList<BigDecimal>();

	public ArrayList<String> extractNumbers(ArrayList<String> phoneNumbers, ArrayList<Long> phoneDurations) { // 1
		String fileName = "./LocalDB/DATA1.CSV";
		String line = "";
		String input2, input3, input4;
		long xSeconds;

		try {
			try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
				while ((line = br.readLine()) != null) {
					String[] employee = line.split(","); // used separator
					input2 = employee[1];
					input3 = employee[2];
					input4 = employee[3];

					Date firstDate = xChangerZ.parse(input3);
					Date secondDate = xChangerZ.parse(input4);
					xSeconds = Math.abs(secondDate.getTime() - firstDate.getTime()) / 100;
					phoneDurations.add(xSeconds);
					phoneNumbers.add(input2);

				}
				br.close();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n======================|01|=======================|Call_Durations|=========\n");
			System.out.println(phoneDurations);

		return phoneNumbers;

	}

	public Object extractFavourite(ArrayList<String> list, ArrayList<Long> phoneDurations) { // 2
		System.out.println("\n======================|02|=====================|Favourite_Number|=========\n");

		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (String i : list) {
			Integer j = hm.get(i);
			hm.put(i, (j == null) ? 1 : j + 1);
		}

		for (Map.Entry<String, Integer> val : hm.entrySet()) {
			System.out.println("PhoneNumber " + val.getKey() + " "
					+ " - occurs : " + val.getValue() + " times");
		}

		System.out.println("Elements-Phone-Book -| " + hm);

		int maxValueInMap = (Collections.max(hm.values()));

		// Iterate through HashMap elementa
		for (Entry<String, Integer> val : hm.entrySet()) {
			if (val.getValue() == maxValueInMap) {
				currentFavourite = val.getKey();

			}
		}
		System.out.println("\n Favourite_Number = "+currentFavourite);
		return currentFavourite;
	}

	public ArrayList<BigDecimal> displayBills(ArrayList<Long> phoneDurations, ArrayList<BigDecimal> phoneBillsTwo) { // 3

		BigDecimal Billchage1;

		for (int i = 0; i < phoneDurations.size() && i < phoneDurations.size(); i++) {
			BigDecimal a = new BigDecimal(phoneDurations.get(i));
			BigDecimal b = new BigDecimal("1.0");
			BigDecimal d = new BigDecimal("0.2");
			BigDecimal maxPrice = new BigDecimal("300");

			if (a.compareTo(maxPrice) == 1) {
				BigDecimal firstCost = b.multiply(maxPrice);
				BigDecimal discountPrice = b.subtract(d);
				BigDecimal discountDuration = a.subtract(maxPrice);
				BigDecimal secondCost = discountPrice.multiply(discountDuration);
				Billchage1 = firstCost.add(secondCost);
			} else {
				Billchage1 = a.multiply(b);
			}

			phoneBillsTwo.add(Billchage1);
		}

		return phoneBillsTwo;

	}

	public ArrayList<BigDecimal> displayDiscounts(ArrayList<BigDecimal> phoneBillsOne, ArrayList<String> phoneNumbers, // 4
			String valx2) {
		BigDecimal Billchage;
		System.out.println("\n======================|03|=====================|Final_Statistics|=========\n");
		
		for (int i = 0; i < phoneNumbers.size(); i++) {

			String s = String.valueOf(phoneNumbers.get(i));
			String s2 = String.valueOf(phoneBillsOne.get(i));
			BigDecimal a = new BigDecimal("0");
			BigDecimal b = new BigDecimal(s);
			BigDecimal c = new BigDecimal(s2);
			BigDecimal d = new BigDecimal(valx2);

			if (b.compareTo(d) == 0) {
				Billchage = a;
			} else {

				Billchage = c;

			}

			phoneBillsTwo.add(Billchage);

		}

		
		System.out.println("Favourite_Number_id   = " + currentFavourite);
		System.out.println("Phone_Numbers_all     = " + phoneNumbers);
		System.out.println("Bills_NoFavourite_id  = " + phoneBillsOne);
		System.out.println("Bill_Finalise_charged = " + phoneBillsTwo);
		System.out.println("\n======================|04|===================|Results_Successful|=========\n");

		return phoneBillsTwo;
	}

	// Driver
	public static void main(String[] args) {
		System.out.println("\n=========================================|PHONE-BILL CALCULATOR|===========");	
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
