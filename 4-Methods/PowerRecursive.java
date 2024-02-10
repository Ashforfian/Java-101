import java.util.Scanner;

public class PowerRecursive {
    static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * pow(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Taban değeri giriniz(Çıkmak için '0'a basınız!):");
            int base = input.nextInt();
            System.out.print("Üs değerini giriniz (Çıkmak için '0'a basınız!):");
            int exponent = input.nextInt();
            if (exponent == 0 && base == 0) break;
            int result = pow(base, exponent);
            System.out.println("Sonuç: " + result);
        }
    }
}