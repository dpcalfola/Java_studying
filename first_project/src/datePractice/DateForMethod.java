package datePractice;

import java.util.Date;

public class DateForMethod {
    public static void main(String[] args) {

        System.out.println(StrDateMethod());


    }

    public static String StrDateMethod() {
        Date dateToday = new Date();
        return dateToday.toString();
    }


}


