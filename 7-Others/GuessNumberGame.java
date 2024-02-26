package Others;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
        boolean isWin = false;
        int right = 0;
        int[] guesses = new int[5];
        while (right < 5) {
            System.out.print((right + 1) + ". sayıyı giriniz: ");
            int guessNumber = input.nextInt();
            if (guessNumber >= 100 || guessNumber <= 0) {
                System.out.println("1-100 arasında değerler giriniz!!");
                continue;
            }
            if (guessNumber == randomNumber) {
                isWin = true;
                break;
            } else {
                if (randomNumber < guessNumber ){
                    System.out.println("Random sayı tahmininizden daha küçüktür!");
                }
                else {
                    System.out.println("Random sayı tahmininizden daha büyüktür!");
                }
                guesses[right++] = guessNumber;
                System.out.println("Kalan hakkınız: "+(5-right));
            }
        }
        if (isWin){
            System.out.println("Tebrikler kazandınız!!");
        }
        else {
            System.out.println("Kaybettiniz!! Bir dahaki sefere :)");
        }
        System.out.println("Random sayı: " + randomNumber);
        System.out.print("Tahminde bulunduğunuz sayılar: ");
        for (int num : guesses) {
            if (num != 0) {
                System.out.print(num + "  ");
            }
        }
    }
}
