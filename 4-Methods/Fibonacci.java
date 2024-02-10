import java.util.Scanner;
public class Fibonacci {
    public  static int fibonacci(int num) {
        if (num==1 || num == 2){
            return 1;
        }else {
            return fibonacci(num-1)+ fibonacci(num-2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter the number: ");
            num = input.nextInt();
            if (num == 0) break;
            System.out.println(fibonacci(num));
        }
    }
}
