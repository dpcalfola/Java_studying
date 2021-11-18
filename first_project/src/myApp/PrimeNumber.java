package myApp;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 100;
        boolean check = true ;
        for(int i = 2 ; i <= n ; i++){
            for(int j = 2 ; j<i ; j++){
                if(i%j==0){
                    //소수가 아님
                    check = false ;
                    break;

                }
            }
            if(check){
                System.out.println(i);
            }
            check = true;
        }
    }
}
