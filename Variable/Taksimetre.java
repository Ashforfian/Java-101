package Variable;

import java.util.Locale;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Gidilen mesafeyi giriniz(KM): ");
        double km = input.nextDouble();
        double taxiAmount = 10 + km * 2.20;
        double price = taxiAmount>20 ? taxiAmount : 20;
        System.out.println("Taksi tutarı: "+price+"TL");
    }
}
