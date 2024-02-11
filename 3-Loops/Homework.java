package Loops;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,total=0;
        System.out.print("Sayı giriniz:");
        num = input.nextInt();
        while (num%2==0){
            total += num;
            System.out.print("Sayı giriniz:");
            num = input.nextInt();
        }
        System.out.println("Toplamları: "+total);
    }
}
