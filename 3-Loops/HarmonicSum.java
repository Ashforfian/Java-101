package Loops;

import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = input.nextInt();
        double sum = 0;
        for (int i=1; i<=num;i++){
            sum += 1.0/i;
        }
        System.out.println("Sonuç: "+sum);
    }
}
