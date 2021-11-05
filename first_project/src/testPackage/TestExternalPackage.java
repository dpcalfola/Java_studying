package testPackage;
import myMessagePackage.MyMessage;

public class TestExternalPackage {
    public static void main(String[] args) {
        MyMessage.startMessage();
        MyMessage.endMessage();
    }
}
