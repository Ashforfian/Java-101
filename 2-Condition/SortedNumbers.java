package Condition;


import java.util.Scanner;

public class SortedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        int enKucuk = sayi1;
        int ortanca = sayi2;
        int enBuyuk = sayi3;

        if (enKucuk > ortanca) {
            int temp = enKucuk;
            enKucuk = ortanca;
            ortanca = temp;
        }
        if (ortanca > enBuyuk) {
            int temp = ortanca;
            ortanca = enBuyuk;
            enBuyuk = temp;
        }
        if (enKucuk > ortanca) {
            int temp = enKucuk;
            enKucuk = ortanca;
            ortanca = temp;
        }
        System.out.println("Sayılar küçükten büyüğe sıralandığında:");
        System.out.println(enKucuk);
        System.out.println(ortanca);
        System.out.println(enBuyuk);
    }
}
