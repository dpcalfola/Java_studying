package objectOrientedProgramming;

public class MyOOP {

    public static void main(String[] args) {

        //..

        printA("----");
        printA("++++");

        //..

        printB("%%%%");
        printB("####");
    }

    private static void printB(String delimiter) {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

    private static void printA(String delimiter) {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
}
