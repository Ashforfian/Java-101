package Condition;

import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isError = false;
        System.out.print("Doğduğunuz ayı giriniz(1-12): ");
        int month = input.nextInt();
        if (month>12 || month<0){
            isError = true;
        }
        System.out.print("Doğduğunuz günü sayı olarak giriniz: ");
        int day = input.nextInt();
        String horoscope = "";
        if (month == 1){
            if (day<=21 ){
                horoscope = "oğlak";
            }else if (day<=31){
                horoscope = "kova";
            }else {
                isError = true;
            }
        }else if (month==2){
            if (day<=19){
                horoscope = "kova";
            } else if (day<=30) {
                horoscope = "balık";
            }else {
                isError = true;
            }
        }else if (month==3){
            if (day<=20){
                horoscope = "balık";
            } else if (day<=31) {
                horoscope =  "koç";
            }else {
                isError = true;
            }
        }else if (month==4){
            if (day<=20){
                horoscope = "koç";
            } else if (day<=30) {
                horoscope =  "boğa";
            }else {
                isError = true;
            }
        }else if (month==5){
            if (day<=21){
                horoscope = "boğa";
            } else if (day<=31) {
                horoscope =  "ikizler";
            }else {
                isError = true;
            }
        }else if (month==6){
            if (day<=22){
                horoscope = "ikizler";
            } else if (day<=30) {
                horoscope =  "yengeç";
            }else {
                isError = true;
            }
        }else if (month==7){
            if (day<=22){
                horoscope = "yengeç";
            } else if (day<=31) {
                horoscope =  "aslan";
            }else {
                isError = true;
            }
        }else if (month==8){
            if (day<=22){
                horoscope = "aslan";
            } else if (day<=31) {
                horoscope =  "başak";
            }else {
                isError = true;
            }
        }else if (month==9){
            if (day<=22){
                horoscope = "başak";
            } else if (day<=30) {
                horoscope =  "terazi";
            }else {
                isError = true;
            }
        }else if (month==10){
            if (day<=22){
                horoscope = "terazi";
            } else if (day<=31) {
                horoscope =  "akrep";
            }else {
                isError = true;
            }
        }else if (month==11){
            if (day<=21){
                horoscope = "akrep";
            } else if (day<=30) {
                horoscope =  "yay";
            }else {
                isError = true;
            }
        }else if (month==12){
            if (day<=21){
                horoscope = "yay";
            } else if (day<=31) {
                horoscope =  "oğlak";
            }else {
                isError = true;
            }
        }if (isError ){
            System.out.println("Hatalı giriş yaptığınız için burcunuzu bulamıyoruz!");
        }else {
            System.out.println("Burcunuz: "+horoscope);
        }
    }
}
