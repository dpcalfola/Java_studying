package stringControl;

public class Split {

    public static void main(String[] args) {

        String a = "aBcdefg1234";
        System.out.println(a.length());
        String[] strArray;
        strArray = a.split("");

        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);

        }



    }
}
