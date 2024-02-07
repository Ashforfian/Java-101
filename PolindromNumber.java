import java.util.Scanner;
public class PolindromNumber {
    public static boolean isPolindrom(int num){
        int temp = num, reverseNum = 0, lastNum;
        while (temp != 0){
            lastNum = temp % 10;
            reverseNum = reverseNum * 10 + lastNum;
            temp /= 10;
        }if (reverseNum == num){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter the number: ");
            int num = input.nextInt();
            if (num == 0){
                break;
            }
            System.out.println(isPolindrom(num));
        }
    }
}