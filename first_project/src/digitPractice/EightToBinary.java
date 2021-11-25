package digitPractice;

public class EightToBinary {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String octStr = "1";
        String[] arrStr = octStr.split("");


        String[] octToBi = {"000", "001", "010", "011", "100", "101", "110", "111"};

        int octCount = octStr.length();

        for (int i = 0; i < arrStr.length; i++) {
            int temp = Integer.parseInt(arrStr[i]);
//            System.out.println("temp : " + temp);
//            System.out.println("octTobi " + octToBi[temp]);
            sb.append(octToBi[temp]);
        }

        System.out.println(sb.toString());


        if (sb.toString().charAt(0) - '0' == 0) {
            sb.deleteCharAt(0);
        }
        if (sb.toString().charAt(0) - '0' == 0) {
            sb.deleteCharAt(0);
        }

        System.out.println("result : " + sb.toString());


    }
}
