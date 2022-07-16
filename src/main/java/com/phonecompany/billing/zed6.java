package com.phonecompany.billing;

import java.io.*;
import java.util.Scanner;

public class zed6 {

    public static void main(String[] args) {

        System.out.println("===================|9-SIX|=================");

        String baseDir = ".";
        String fileName = baseDir + "/LocalDB/DATA1.CSV";
        File numbers = new File(fileName);
        FileInputStream input = null;
        Scanner reader = null;

        try {
            input = new FileInputStream(numbers);
            reader = new Scanner(input).useDelimiter(",");

            while (reader.hasNext()) {
                System.out.print(reader.next());
            }
            System.out.println(reader);

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
      //  System.out.println(reader);
      System.out.println("===================|9-SIX|=================");
    }
}
