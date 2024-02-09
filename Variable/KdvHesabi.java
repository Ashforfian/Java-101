package Variable;

import java.util.Scanner;

public class KdvHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz tutarı giriniz(TL): ");
        int price = input.nextInt();
        double totalPrice = price <= 1000 ? price * 1.18: price * 1.08;
        System.out.println("Kdv'li tutar: "+totalPrice+" TL");
    }
}
