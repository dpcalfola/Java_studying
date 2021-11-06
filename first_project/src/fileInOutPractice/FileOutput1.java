package fileInOutPractice;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput1 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("FileOutputResult1");

        for (int i = 1; i < 10; i++) {

            fw.write("line: Number" + i + "\n");
            System.out.println("line: Number" + i);
        }


        FileWriter fw2 = new FileWriter("FileOutputResult1", true); // true : to add contents

        for (int i = 10; i < 21; i++) {

            fw2.write("line: Number" + i + "\n");
            System.out.println("line: Number" + i);
        }


        fw.close();
        fw2.close();

    }
}
