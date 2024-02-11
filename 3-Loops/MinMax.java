package Loops;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int numberAmount = input.nextInt();
        int maxNumber;
        int minNumber;

        System.out.print("1. sayıyı giriniz: ");
        int number  = input.nextInt();
        maxNumber = number;
        minNumber = number;
        for (int i = 1; i<numberAmount; i++){
            System.out.print((i+1)+". sayıyı giriniz: ");
            number  = input.nextInt();
            if (number<minNumber){
                minNumber = number;
            }
            if (number>maxNumber){
                maxNumber = number;
            }
        }
        System.out.println("En büyük sayı: "+maxNumber);
        System.out.println("En küçük sayı: "+minNumber);
    }
}
