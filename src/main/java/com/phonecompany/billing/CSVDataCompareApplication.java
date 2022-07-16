package com.phonecompany.billing;

import java.io.*;
import java.util.ArrayList;

/* file1 - file2 = file3*/
public class CSVDataCompareApplication {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        String baseDir = ".";
        String file1 = baseDir + "/LocalDB/DATA1.CSV";
        String file2 = baseDir + "/LocalDB/DATA2.CSV";
        String file3 = baseDir + "/LocalDB/DATA3.CSV";

        ArrayList<String> arrayList1 = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        // ArrayList al3=new ArrayList();

        BufferedReader CSVFile1 = new BufferedReader(new FileReader(file1));
        String dataRow1 = CSVFile1.readLine();
        while (dataRow1 != null) {
            String[] dataArray1 = dataRow1.split(" , ");
            for (String item1 : dataArray1) {
                arrayList1.add(item1);
            }

            dataRow1 = CSVFile1.readLine(); // Read next line of data.
        }

        CSVFile1.close();

        BufferedReader CSVFile2 = new BufferedReader(new FileReader(file2));
        String dataRow2 = CSVFile2.readLine();
        while (dataRow2 != null) {
            String[] dataArray2 = dataRow2.split(" , ");
            for (String item2 : dataArray2) {
                arrayList2.add(item2);

            }
            dataRow2 = CSVFile2.readLine(); // Read next line of data.
        }
        CSVFile2.close();
        System.out.println("=============|arrayList1|====================");
        System.out.println(arrayList1);
        System.out.println(arrayList2);
        System.out.println("=============|arrayList2|====================");
        System.out.println(dataRow1);
        System.out.println(dataRow2);
        System.out.println("=============|arrayList1|====================");

        for (String bs : arrayList2) {
           // arrayList2.remove(bs);
            arrayList1.remove(bs);
        }

        int size = arrayList1.size();
        int size2 = arrayList2.size();
        System.out.println("=============|arrayList3|====================");
        System.out.println(size);
        System.out.println(size2);
   
        System.out.println(arrayList1);
        System.out.println(arrayList1.getClass());
        System.out.println(arrayList1.get(size-1).getClass());
        System.out.println(arrayList1.get(1));
        System.out.println(arrayList1.get(size-2));
        System.out.println("=============|arrayList4|====================");

        System.out.println(arrayList2);
        System.out.println(arrayList2.getClass());
        System.out.println(arrayList2.get(size2-1).getClass());
        System.out.println(arrayList2.get(1));
        System.out.println(arrayList2.get(size2-2));
        System.out.println("=============|arrayList5|====================");

        try {
            FileWriter writer = new FileWriter(file3);
            while (size != 0) {
                size--;
                writer.append("" + arrayList1.get(size));
                writer.append('\n');
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}