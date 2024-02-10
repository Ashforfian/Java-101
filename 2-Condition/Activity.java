package Condition;

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Hava çok soğuk, Kayak yapmayı öneririm.");
        } else if (sicaklik < 15) {
            System.out.println("Hava serin, Sinema etkinliğini öneririm.");
        } else if (sicaklik < 25) {
            System.out.println("Hava güzel, Piknik etkinliğini öneririm.");
        } else {
            System.out.println("Hava sıcak, Yüzme etkinliğini öneririm.");
        }

    }
}
