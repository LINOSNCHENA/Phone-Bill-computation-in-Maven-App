package com.phonecompany.billing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class zed4 {
    public static void main(String[] args) {
        String baseDir = ".";
        String fileName = baseDir + "/LocalDB/DATA1.CSV";
        File file = new File(fileName);
        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try {
            inputStream = new Scanner(file);

            while (inputStream.hasNext()) {
                String line = inputStream.next();
                String[] values = line.split(",");
                lines.add(Arrays.asList(values));
                System.out.println("=========================25===ZLINES===========================");
                System.out.println(lines);
            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("=========================33===ZLINES===========================");
        // the following code lets you iterate through the 2-dimensional array
        int lineNo = 1;
        int lineNo2 = 1;
        for (List<String> line : lines) {
            int columnNo = 1;
            System.out.println("====|===");
            for (Object value : line) {

                System.out.print("Line " + lineNo + " Column " + columnNo + ": " + value + "Cost-Bill" + (value));
                columnNo++;
            }
            lineNo++;
        }
        System.out.println("============================Z===========================");
        for (List<String> line : lines) {
            int columnNo = 1;
            System.out.println("====|===");
            for (Object value : line) {
                System.out.println(
                        "LineX1 " + lineNo2 + " ColumnX2 " + columnNo + ":xxxx3 " + value + " Cost-BillX4 " + (value));
                columnNo++;
            }
            lineNo2++;
        }
        System.out.println("============================ZLINES===========================");
        System.out.println(lines);
        System.out.println("============================Z=LINES==========================");
    }

}
