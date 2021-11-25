package stringControl;

public class testStringBuilder3 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();


        String[] arrStr = new String[10];
        int[] arrInt = new int[10];


//        for (int i = 0; i < arrStr.length; i++) {
//            arrStr[i] = Double.toString(Math.floor(Math.random() * 10));
//        }

        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = (int) (Math.floor(Math.random()*10)) ;

        }

        for (int i = 0; i < arrStr.length; i++) {
            sb.append(arrInt[i]);

        }

        System.out.println(sb.toString());



    }
}
