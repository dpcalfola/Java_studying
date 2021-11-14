package objectOrientedProgramming;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

    public static void main(String[] args) throws IOException {

        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));
        //               Math : class  // .floor : method  // .PI : variable


        FileWriter f1 = new FileWriter("./text/OthersOOP.txt"); //   ./  <- 프로젝트 상대 경로

        f1.write("Hello");
        f1.write(" OOP");
        f1.close();

        FileWriter f2 = new FileWriter("./text/OthersOOP2.txt"); //   ./  <- 프로젝트 상대 경로

        f2.write("Hello");
        f2.write(" OOP 2 !!");
        f2.close();




        /// f1, f2 : instance
        /// FileWriter : class

        /*
        *
        * class : System, Math, FileWriter
        * instance : f1, f2
        *
        *
        *
        *
        *
        * */







    }
}
