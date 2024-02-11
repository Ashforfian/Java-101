package Condition;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int year = input.nextInt();
        if (year%4==0 && year %100 != 0){
            System.out.println(year+" yılı artık bir yıldır!");
        } else if (year % 100 == 0) {
            if (year % 400 == 0){
                System.out.println(year+" yılı artık bir yıldır!");
            }else {
                System.out.println(year+" yılı artıl bir yıl değildir!");
            }

        }else {
            System.out.println(year+" yılı artık bir yıl değildir!");
        }
    }
}
