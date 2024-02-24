package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int length = input.nextInt();

        int[] numbers = new int[length];
        int i = 0;
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int num : numbers){
            System.out.print((i+1)+". Elemanı: ");
            int element = input.nextInt();
            numbers[i++] = element;
        }
        Arrays.sort(numbers);
        System.out.print("Sıralama: ");
        for (int num : numbers){
            System.out.print(num + "  ");
        }
    }
}
