package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        int temp;
        System.out.print(n1+"\t"+n2+"\t");
        for (int i=0; i<number-2; i++){
            temp = n1;
            n1 = n2;
            n2 = temp + n2;
            System.out.print(n2+"\t");
        }
    }
}
