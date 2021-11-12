package datePractice;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFileWriterPrintfSpace_failed {


    public static void main(String[] args) throws IOException {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("EEEE, MMMM, dd, yyyy : ");
//        SimpleDateFormat = String.format("%-10s",SimpleDateFormat("EEEE, MMMM, dd, yyyy : "); );
        System.out.println("Recorde in text : " + String.format("%-20s", date.format(today)));

        FileWriter fw = new FileWriter("TodayDateRecordePrintfSpace.txt", true);


        fw.write("\n" + date.format(today));
        fw.close();


    }


}
