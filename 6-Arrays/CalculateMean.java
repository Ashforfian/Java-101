package Arrays;

public class CalculateMean {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        double mean = (double) sum / numbers.length;
        System.out.println("Ortalaması: "+ mean);
    }
}
