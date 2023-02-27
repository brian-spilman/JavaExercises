package Exercises.DateWork;

import java.util.Date;
import java.util.Scanner;

public class DateWork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Date theDate = new Date();
        System.out.println("Current date/time: ");
        System.out.println(theDate); // implicitly uses toString()

        System.out.println("Current date/time in milliseconds: ");
        System.out.println(theDate.toInstant().toEpochMilli());

        System.out.print("Input milliseconds since 1970 to calculate date: ");
        long milli = scan.nextLong();
        theDate.setTime(milli);
        System.out.println(theDate);

    }
}
