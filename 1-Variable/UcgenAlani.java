package Variable;

import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 1. kenarını giriniz: ");
        int a = input.nextInt();

        System.out.print("Üçgenin 2. kenarını giriniz: ");
        int b = input.nextInt();

        System.out.print("Üçgenin 3. kenarını giriniz: ");
        int c = input.nextInt();

        double u = (a+b+c)/2.0;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: "+area);
    }
}
