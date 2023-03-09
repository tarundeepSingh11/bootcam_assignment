package question6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class part2 {
    public static void main(String[] args) {
        Date today=new Date();
        DateFormat df=new SimpleDateFormat("DD-MM-YYYY HH:MM:SS");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        System.out.println("Date in Indian Timezone (IST) : " + IST);

        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String PST = df.format(today);
        System.out.println("Date in PST Timezone : " + PST);

        df.setTimeZone(TimeZone.getTimeZone("Africa/Tunis"));
        String Africa=df.format(today);
        System.out.println("Date in africa rimezone"+ Africa);


    }
}
