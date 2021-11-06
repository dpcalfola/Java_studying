package testPackage;
import myMessagePackage.MyMessage;
//import myMessagePackage.*;

public class TestExternalPackage {
    public static void main(String[] args) {
        System.out.println(MyMessage.programNameString() + " testExternalPackage >");
        MyMessage.startMessage();
        MyMessage.endMessage();
    }
}
