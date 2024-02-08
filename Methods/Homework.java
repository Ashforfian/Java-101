public class Homework {
    public static void printPattern(int num) {
        System.out.print(num + "\t");
        if (num <= 0) {
            return;
        }
        printPattern(num - 5);
        System.out.print(num + "\t");
    }
    public static void main(String[] args) {
        printPattern(21);
    }
}
