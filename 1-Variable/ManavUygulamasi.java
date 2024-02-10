package Variable;

import java.util.Locale;
import java.util.Scanner;

public class ManavUygulamasi {
    /* Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı; */
    public static void main(String[] args) {
        double APPLE_PRICE = 3.67, PEAR_PRICE = 2.14, TOMATO_PRICE = 1.11, BANANA_PRICE = 0.95, AUBERGINE_PRICE = 5;
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Kaç kilo armut?");
        double pear = input.nextDouble();
        System.out.println("Kaç kilo elma?");
        double apple = input.nextDouble();
        System.out.println("Kaç kilo domates?");
        double tomato = input.nextDouble();
        System.out.println("Kaç kilo muz?");
        double banana = input.nextDouble();
        System.out.println("Kaç kilo patlıcan?");
        double aubergine = input.nextDouble();
        double price = pear*PEAR_PRICE+apple*APPLE_PRICE+tomato*TOMATO_PRICE+banana*BANANA_PRICE+aubergine*AUBERGINE_PRICE;
        System.out.println("Toplam tutar: "+price+" TL");
    }
}
