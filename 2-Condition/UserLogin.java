package Condition;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        String password = input.nextLine();
         if (userName.equals("Patika") && password.equals("Java123")){
             System.out.println("Sisteme giriş yapılıyor!!");
         } else if (userName.equals("Patika") && !password.equals("Java123")) {
             System.out.print("Şifreniz yanlış!!\nSıfırlamak istiyor musunuz(E/H): ");
             String confirmation = input.nextLine();
             if (confirmation.equals("E")){
                 System.out.print("Yeni şifrenizi giriniz: ");
                 String newPassword = input.nextLine();
                 if (newPassword.equals("Java123")){
                     System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                 }else {
                     System.out.println("Şifre oluşturuldu.");
                 }
             }
         }else {
             System.out.println("Girdiğiniz bilgiler hatalı!");
         }
    }
}
