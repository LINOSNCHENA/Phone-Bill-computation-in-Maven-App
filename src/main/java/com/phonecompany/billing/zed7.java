package com.phonecompany.billing;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class zed7 {
    public static void main(String[] args) throws ParseException {
        String baseDir = ".";
        String fileName = baseDir + "/LocalDB/DATA6.CSV";
        String line = "";
        String splitBy = ",";
        String input1;
        String input2;

      //  BigDecimal totalBilling;
        try {
            // parsing a CSV file into BufferedReader class constructor
            System.out.println("=========================17===ZLINES===========================");
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                while ((line = br.readLine()) != null) {
                    String[] employee = line.split(splitBy); // use comma as separator

                    System.out.println("=========================22===ZLINES===========================");
                    input1 = employee[3];
                    input2 = employee[4];
                    System.out.println("1-Inputzed-" + input1);
                    System.out.println("2-Employee-" + employee[3].getClass());
                    System.out.println("3-Employes-" + employee);
                    System.out.println("4-Employee-" + employee[3]);
                    System.out.println("\n" + "XXXXX   = " + input1);

                    // Convert the string input to BigDecimal
                    // BigDecimal a = new BigDecimal("'"+input1+"'");
                    // BigDecimal b = new BigDecimal(input2);
                   //  String input3 = "0.5";
                    // input4 = input2;
                  //   BigDecimal price = new BigDecimal(input3);
                    // totalBilling = a.subtract(b);

                    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss", Locale.ENGLISH);
                    // Date firstDate1 = sdf.parse("06/2/1984");
                    // Date secondDate2 = sdf.parse("06/3/1984");
                    Date firstDate = sdf.parse(input1);
                    Date secondDate = sdf.parse(input2);

                    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
                    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                    long diff1 = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.SECONDS);
                    long diff2 = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MINUTES);
                    long diff3 = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.HOURS);
                    long diff4 = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.DAYS);

                    // Display the result
                    System.out.println("|" +secondDate+ " = A-PERIOD-B= " + firstDate);
                    System.out.println("|" + "The PERIOD11 in ORIGINAL   = " + diffInMillies);
                    System.out.println("|" + "The PERIOD22 in Miliseconds   = " + diff);
                    System.out.println("|" + "The PERIOD22 in SecondsYears   = " + diff1);
                    System.out.println("|" + "The PERIOD22 in MinutesYears   = " + diff2);
                    System.out.println("|" + "The PERIOD22 in HoursOfYears   = " + diff3);
                    System.out.println("|" + "The PERIOD22 in DAYSYears   = " + diff4);
                    // System.out.println("\n" + "The PERIOD in seconds = " + milliseconds);
                 //   System.out.println("\n" + "The PERIOD in seconds   = " + totalBilling);
                  //  System.out.println("The CHARGE in dollars = " + price.multiply(totalBilling) + "\n");

                }
                br.close(); // zed
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=========================56===ZLINES===========================");
    }

    static String input4;

   
}
