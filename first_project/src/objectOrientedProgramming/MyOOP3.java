package objectOrientedProgramming;


public class MyOOP3 {


    public static void main(String[] args) {

        MyInstancePrint p1 = new MyInstancePrint();

        p1.delimiter = "@@@@";
        p1.A();
        p1.B();


        MyInstancePrint p2 = new MyInstancePrint();
        p2.delimiter = "!!!!";
        p2.B();
        p2.A();


    }


}


