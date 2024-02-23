package Arrays;

public class RepeatingEvenNumbers {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 2, 3, 4, 5, 1, 9, 4, 8, 7, 8, 12, 13};
        int[] repeated = new int[numbers.length];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    if (numbers[i] % 2 == 0 && !isFind(repeated, numbers[i])) {
                        repeated[k++] = numbers[i];
                        break;
                    }
                }
            }
        }
        for (int num : repeated) {
            if (num != 0) {
                System.out.print(num + "\t");
            }
        }
    }
}
