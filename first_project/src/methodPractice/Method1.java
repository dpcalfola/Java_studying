package methodPractice;

import java.io.FileWriter;
import java.io.IOException;

public class Method1 {
    public static void main(String[] args) throws IOException {

//        System.out.println("Hello Method");
//        System.out.println(Math.floor(1.1));


        // ("a", "*") 인자 == argument
        printTwoTimes("a", "*");
        writeFileTwoTimes("a", "*");
        writeFileTwoTimes("b", "!");

        System.out.println("");

        System.out.println(twoTimes("a", "%"));


    }

    // (String text, String delimiter) 매개변수 == parameter
    public static void printTwoTimes(String text, String delimiter) {

        System.out.println(text);
        System.out.println(delimiter);
        System.out.println(text + delimiter);

    }

    public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
        FileWriter fw = new FileWriter("methodPracticeOutput.txt");
        fw.write(delimiter + "\n");
        fw.write(text + "\n");
        fw.write(text + "\n");
        fw.close();
    }


    public static String twoTimes(String text, String delimiter) {
        String out;
        out = delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }
}

