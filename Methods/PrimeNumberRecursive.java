import java.util.Scanner;

public class PrimeNumberRecursive {
    static boolean isPrimeNumber(int num, int i){
        if (num <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return isPrimeNumber(num, i - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number(0 to quit!): ");
            int num = input.nextInt();
            if (num == 0) break;
            boolean result = isPrimeNumber(num, num-1);
            if (result == true){
                System.out.println("Number of "+num+" is a prime number.");
            } else  {
                System.out.println("Number of "+num+" is not a prime number.");
            }
        }
    }
}
