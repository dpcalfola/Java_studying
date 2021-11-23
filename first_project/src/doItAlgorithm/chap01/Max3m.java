package doItAlgorithm.chap01;

public class Max3m {
    // a, b, c 의 최대값을 구하여 반환

    public static int max3(int a, int b, int c) {

        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        return max;
    }


    public static int max4(int a, int b, int c, int d) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        return max;
    }


    public static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        return min;

    }


    public static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }

        return min;
    }


}
