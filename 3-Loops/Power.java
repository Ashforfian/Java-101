package Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Limit değerini giriniz: ");
        int limit = input.nextInt();
        System.out.println("4'ün katları:");
        for (int i = 1; i<limit; i*=4){
            System.out.print(i+"\t");
        }
        System.out.println("\n5'in Katları:");
        for (int i = 1; i<limit; i*=5){
            System.out.print(i+"\t");
        }
    }
}
