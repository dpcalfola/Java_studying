package datePractice;


import java.text.SimpleDateFormat;
import java.util.Date;


public class Date2 {
    public static void main(String[] args) {

        Date today = new Date();

        System.out.println(today);



        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("Date: " + date.format(today));
        System.out.println("Time: " + time.format(today));


    }
}
