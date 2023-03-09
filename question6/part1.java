package question6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Date ");

        String date = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
       Date date2 = null;
        try {
            //Parsing the String
            date2 = dateFormat.parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //System.out.println(date2);
        System.out.println("Enter the Date2 ");

        String date3 = scanner.next();

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
        Date date4 = null;
        try {
            //Parsing the String
            date4 = dateFormat1.parse(date3);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(date2);
        System.out.println(date4);
        if(date2.compareTo(date4) > 0) {
            System.out.println("Date 1 occurs after Date 2");
        } else if(date2.compareTo(date4) < 0) {
            System.out.println("Date 1 occurs before Date 2");
        } else if(date2.compareTo(date4) == 0) {
            System.out.println("Both dates are equal");
        }

    }
}
