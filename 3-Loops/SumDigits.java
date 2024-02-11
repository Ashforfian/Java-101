package Loops;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int num = input.nextInt();
        int temp = num;
        int digit;
        int sum=0;
        do{
            digit = temp%10;
            sum += digit;
            temp /= 10;
        }while (digit!=0);
        System.out.println(num+"sayısının basamaklar toplamı: "+sum);
    }
}
