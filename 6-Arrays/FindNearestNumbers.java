package Arrays;

import java.util.Scanner;

public class FindNearestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[] {15,12,788,1,-1,-778,2,0};
        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();
        int difference;
        int smallerDifference = Integer.MAX_VALUE;
        int biggerDiference = Integer.MAX_VALUE;
        int smallNumber = 0;
        int bigNumber = 0;
        for (int i : numbers){
            difference = (number - i);
            if (difference > 0 && smallerDifference > difference){
                smallerDifference = difference;
                smallNumber = i;
            } else if (difference < 0) {
                difference = Math.abs(difference);
                if (biggerDiference > difference) {
                    biggerDiference = difference;
                    bigNumber = i;
                }
            }
        }
        System.out.println("Kendinden küçük en büyük sayı: "+smallNumber);
        System.out.println("Kendinden büyük en küçük sayı: "+bigNumber);
    }
}

