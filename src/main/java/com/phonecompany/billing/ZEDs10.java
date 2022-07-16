package com.phonecompany.billing;

/* ............... START ............... */

import java.sql.Timestamp;
import java.util.Calendar;

public class ZEDs10 {
    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();
        Timestamp timestamp1 = new Timestamp(date.getTime());

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(timestamp1.getTime());

        // add a bunch of seconds to the calendar
        cal.add(Calendar.SECOND, 98765);

        // create a second time stamp
        Timestamp timestamp2 = new Timestamp(cal.getTime().getTime());

        long milliseconds = timestamp2.getTime() - timestamp1.getTime();
        int seconds = (int) milliseconds / 1000;

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;

        System.out.println("timestamp1: " + timestamp1);
        System.out.println("timestamp2: " + timestamp2);

        System.out.println("Difference: ");
        System.out.println(" Hours: " + hours);
        System.out.println(" Minutes: " + minutes);
        System.out.println(" Seconds: " + seconds);
    }
}
/* ............... END ............... */