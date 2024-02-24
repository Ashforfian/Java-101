package Arrays;

import java.util.Arrays;


public class FrequencyElementInArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 20, 10, 10, 20, 5, 20, 2, 23, 45, 2};
        int[] frequencies = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            int frequency = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (element == numbers[j]) {
                    frequency++;
                }
            }
            frequencies[i] = frequency;
        }
        for (int i = 0; i < numbers.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.println(numbers[i] + " sayısı " + frequencies[i] + " kere tekrar edildi. ");
            }
        }
    }
}

