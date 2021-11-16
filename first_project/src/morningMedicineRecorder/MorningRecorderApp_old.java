package morningMedicineRecorder;

import myMessagePackage.MyMessage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MorningRecorderApp_old {
    static boolean answer0 = false;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        MyMessage.startMessage();


        if (getAnswer()) {
            recordTextFile();
        }


        MyMessage.endMessage();

    }


    private static boolean getAnswer() {


        System.out.println("Did you take a morning medicine? y/n");
        String answer1 = scan.next();
        if (answer1.equals("y")) {
            System.out.println("Please confirm one more time. y/n");
            String answer2 = scan.next();
            answer0 = answer2.equals("y");

        }

        if (!answer0) {
            System.out.println("Thank you. Bye");
        }

        return answer0;


    }


    private static void recordTextFile() throws IOException {

        FileWriter fw = new FileWriter("./src/morningMedicineRecorder/RecorderResult.txt", true);

        fw.write(DateMethod.today() + ": Morning medicine is taken.\n");
        System.out.println("\nText file recorded : " + DateMethod.today() + " - Morning medicine is taken.");
        fw.close();


    }


}
