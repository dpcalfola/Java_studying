package digitPractice;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 9;

        System.out.println(sumOfDigit(n));


    }


    private static int sumOfDigit(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

}
