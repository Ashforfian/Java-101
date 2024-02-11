package Loops;

import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int number2 = input.nextInt();
        int i = 1;
        if (number2<number1){
            int temp = number2;
            number2 = number1;
            number1 = temp;
        }
        int ebob=1;
        while (i<number1){
            if (number1 % i == 0 && number2 % i == 0){
                ebob = i;
            }
            i++;
        }
        int ekok = number1*number2 / ebob;
        System.out.println("Ebob: "+ebob);
        System.out.println("Ekok: "+ekok);
    }
}
