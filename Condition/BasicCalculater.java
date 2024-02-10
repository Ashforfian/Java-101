package Condition;

import java.util.Scanner;

public class BasicCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n";

        System.out.println(menu);
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        int operation = input.nextInt();
        System.out.print("İlk sayıyı giriniz: ");
        int num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = input.nextInt();
        switch (operation){
            case 1:
                System.out.println("Toplamları: "+(num1+num2));
                break;
            case 2:
                System.out.println("Farkları: "+(num1-num2));
                break;
            case 3:
                System.out.println("Çarpımları: "+(num1*num2));
                break;
            case 4:
                if (num2!= 0) {
                    System.out.println("Bölümleri: "+(num1/num2));
                }else{
                    System.out.println("İkinci sayıyı 0 giremezsiniz!");
                }
                break;
            default:
                System.out.println("Geçersiz bir değer girdiniz");
        }
    }
}
