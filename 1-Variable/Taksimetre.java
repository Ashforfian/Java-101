package Variable;

import java.util.Locale;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double PRICE_PER_KM = 2.20, START_PRICE = 10, MIN_PRICE = 20;
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Gidilen mesafeyi giriniz(KM): ");
        double km = input.nextDouble();
        double taxiAmount = START_PRICE + km * PRICE_PER_KM;
        double price = taxiAmount>MIN_PRICE ? taxiAmount : MIN_PRICE;
        System.out.println("Taksi tutarı: "+price+"TL");
    }
}
