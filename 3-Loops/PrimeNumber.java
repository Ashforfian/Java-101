package Loops;


public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime;
        for (int i  = 1; i<=100; i++) {
            if (i == 1) {
                isPrime = false;
            }
            else {
                isPrime = true;
            }
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }if (isPrime){
                System.out.print(i+"\t");
            }
        }
    }
}

