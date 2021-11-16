package morningMedicineRecorder;

import myMessagePackage.MyMessage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MorningRecorderApp_NOW {
    static boolean answer0 = false;
    static Scanner scan = new Scanner(System.in);
    static String getNotable;
    static String addMassage;
    static int notableState = 0;


    public static void main(String[] args) throws IOException {

        MyMessage.startMessage();


        if (getAnswer()) {
            recordTextFile();
        }

//        System.out.println(notableState); // to check up notableState


        MyMessage.endMessage();

    }


    private static boolean getAnswer() {


        System.out.println("Did you take a morning medicine? y/n");
        String answer1 = scan.next();
        if (answer1.equals("y")) {
            // something notable : start

            System.out.println("\nDid you have any missing pill?");
            System.out.println("n:NO / m:I missed Morning's / w: I missed Well");
            getNotable = scan.next();
            if (getNotable.equals("m")) {
                System.out.println("Ok. It's gonna be checked <Code:M>");
                notableState = 1;
            } else if (getNotable.equals("w")) {
                System.out.println("Ok. It's gonna be checked <Code:W>");
                notableState = 2;
            } else {
                System.out.println("Ok. There's nothing special");
            }

            //something notable : end


            System.out.println("\nPlease confirm one more time. y/n");
            String answer2 = scan.next();
            answer0 = answer2.equals("y");

        }

        if (!answer0) {
            System.out.println("Thank you. Bye\n");
        }

        return answer0;


    }


    private static void recordTextFile() throws IOException {

        FileWriter fw = new FileWriter("./src/morningMedicineRecorder/RecorderResult.txt", true);
        // Warning!! : Setting value is not a test text !!
        // Warning!! : text file is important !!



        String recodingMassage = DateMethod.today() + ": Morning medicine is taken." + addMassages() + "\n";

        fw.write(recodingMassage);
        System.out.println("\nText file recorded : " + recodingMassage);
        fw.close();


    }

    private static String addMassages() {

        if (notableState == 0) {
            addMassage = "";
        }
        if (notableState == 1) {
            addMassage = " (only 웰)";
        }
        if (notableState == 2) {
            addMassage = " (only morning fills)";
        }
        return addMassage;
    }


}
