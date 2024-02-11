package Loops;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin büyüklüğünü giriniz: ");
        int n = input.nextInt();
        for (int i = n; i>=1; i--){
            for (int j = 1; j<=(2*n-1); j++){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}
