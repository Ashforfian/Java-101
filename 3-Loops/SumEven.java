package Loops;

import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        if (num % 2 != 0) {
            num--;
        }int total = 0;
        for (int i = 2; i<=num; i+=2){
            total += i;
        }
        System.out.println("Toplamları: "+total);

    }
}
