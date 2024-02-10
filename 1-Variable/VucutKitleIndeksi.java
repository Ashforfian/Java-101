package Variable;

import java.util.Locale;
import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        double height = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        double weight = input.nextDouble();
        double bmi = weight/(height*height);
        System.out.println("Vücut Kitle İndeksiniz: "+bmi);
    }
}
