package Condition;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the music grade: ");
        int music = input.nextInt();
        if (music >= 0 && music <= 100){
            total+=music;
        }else {
            System.out.println("You enter wrong value!");
        }
        System.out.print("Enter the math grade: ");
        int math = input.nextInt();
        if (math >= 0 && math <= 100){
            total += math;
        }else {
            System.out.println("You enter wrong value!");
        }

        System.out.print("Enter the physic grade: ");
        int physic = input.nextInt();
        if (physic >= 0 && physic <= 100){
            total+=physic;
        }else {
            System.out.println("You enter wrong value!");
        }

        System.out.print("Enter the chemistry grade: ");
        int chem = input.nextInt();
        if (chem >= 0 && chem <= 100){
            total+=chem;
        }else {
            System.out.println("You enter wrong value!");
        }

        System.out.print("Enter the turkish grade: ");
        int turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100){
            total+=turkish;
        }else {
            System.out.println("You enter wrong value!");
        }



        double average = total / 5.0;
        if (average>55){
            System.out.println("You passed.");
        }else {
            System.out.println("You failed.");
        }
        System.out.println("Your average: "+average);
    }
}
