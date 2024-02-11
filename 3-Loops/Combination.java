package Loops;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("C(n,r) olmak üzere n sayını giriniz: ");
        int n = input.nextInt();
        int temp = n;
        System.out.print("C(n,r) olmak üzere r sayını giriniz: ");
        int r = input.nextInt();
        int combination = 1;
        for (int i = r; i>=1; i--){
            combination *= temp;
            temp--;
        }
        System.out.println("C("+n+","+r+") = "+combination);
    }
}
