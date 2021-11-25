package stringControl;

public class testStringBuilder1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append(1234);
        sb.append("56789");

        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.substring(3)); // 3번째까지 자르고 뒷부분을 출력 // 456789
        System.out.println(sb.substring(3,7)); // index3 ~ 6번째까지 출력 // 4567
        System.out.println(sb.charAt(3));

    }
}
