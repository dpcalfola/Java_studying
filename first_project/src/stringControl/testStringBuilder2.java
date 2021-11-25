package stringControl;

public class testStringBuilder2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("ABCDEFG");
        sb.append(12345);

        System.out.println(sb.substring(3, 4));
        System.out.println(sb.charAt(3));
        System.out.println(sb.length());

//        for (int i = 0; i < sb.length(); i++) {
//
//            System.out.println(sb.charAt(i));
//
//        }

        System.out.println(sb.charAt(4));
        System.out.println(sb.substring(4,5));

    }
}
