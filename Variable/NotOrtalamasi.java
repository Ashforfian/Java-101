package Variable;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the music grade: ");
        int music = input.nextInt();

        System.out.print("Enter the math grade: ");
        int math = input.nextInt();

        System.out.print("Enter the physic grade: ");
        int physic = input.nextInt();

        System.out.print("Enter the chemistry grade: ");
        int chem = input.nextInt();

        System.out.print("Enter the turkish grade: ");
        int turkish = input.nextInt();

        System.out.print("Enter the history grade: ");
        int history = input.nextInt();

        int sum = music+math+physic+chem+turkish+history;
        double average = sum / 6.0;
        String result = average > 60 ? "You passed" : "You failed";
        System.out.println(result+" with "+average+" score.");
    }
}
