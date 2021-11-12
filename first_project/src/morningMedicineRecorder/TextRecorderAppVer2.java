package morningMedicineRecorder;

import myMessagePackage.MyMessage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextRecorderAppVer2 {
    static boolean answer0 = false, addAnswer0 = false;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        MyMessage.startMessage();


        if (getAnswer()) {
            recordTextFile();
        }

        if (getAnswer2()) {
            recordTextFile2();

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

    private static boolean getAnswer2() {
        System.out.println("\n\nDid you take a additional medicine? y/n");
        String addAnswer1 = scan.next();
        if (addAnswer1.equals("y")) {
            System.out.println("Please confirm one more time. y/n");
            String addAnswer2 = scan.next();
            addAnswer0 = addAnswer2.equals("y");

        }

        if (!addAnswer0) {
            System.out.println("Thank you. Bye");

        }

        return addAnswer0;
    }


    private static void recordTextFile() throws IOException {

        FileWriter fw = new FileWriter("MorningMedicineRecorderResultVer2.txt", true);

        fw.write(DateMethod.today() + ": Morning medicine is taken.\n");
        System.out.println("\nText file recorded : " + DateMethod.today() + " - Morning medicine is taken.");
        fw.close();


    }

    private static void recordTextFile2() throws IOException {

        FileWriter fw = new FileWriter("MorningMedicineRecorderResultVer2.txt", true);

        fw.write(DateMethod.today() + ": Added medicine is taken.\n");
        System.out.println("\nText file recorded : " + DateMethod.today() + " - Added medicine is taken.");
        fw.close();


    }
//
//    private static void morningMedicineTaken() {
//        String didTaken = "Morning medicine is taken.";
//        String didNotTaken = "Morning medicine is not taken." ;
//    }


}
