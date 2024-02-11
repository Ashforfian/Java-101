package Condition;

import java.util.Scanner;

public class PlanePrice {
    public static void main(String[] args) {
        double PER_KM = 0.10;
        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz mesafeyi giriniz(KM): ");
        int distance = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int travelType = input.nextInt();
        if (travelType <=2 && age>0 && distance>0 && travelType>0){
            double grossPrice = distance * PER_KM;
            double price = grossPrice;
            if (age<12){
                price = grossPrice*0.5;
            }else if (age <24){
                price = grossPrice * 0.9;
            } else if (age>65) {
                price = grossPrice*0.7;
            }if (travelType == 2){
                price *= 0.8;
                price*=2;
            }
            System.out.println("Toplam tutar: "+price+"TL");
        }else {
            System.out.println("Hatalı giriş yaptınız!!");
        }
    }
}
