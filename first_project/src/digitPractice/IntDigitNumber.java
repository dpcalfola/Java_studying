package digitPractice;

public class IntDigitNumber {

    public static void main(String[] args) {
        int n = 293872;
//        int nLength = (int) (Math.log10(n) + 1);

//        System.out.println(nLength);

        System.out.println(n);
        System.out.println(getDigitNum(n, 4));


    }


    private static int getDigitNum(int n, int i) {
        String str = String.valueOf(n);
        String[] arrStr = str.split("");

        int result = Integer.parseInt(arrStr[i]);

        return result;

        // 제일 앞자리 index 0부터 시작

    }

}
