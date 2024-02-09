package Variable;

import java.util.Scanner;

public class DaireKesiti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Yarıçap: ");
        int r = input.nextInt();
        System.out.print("Yayın açısı: ");
        int a = input.nextInt();
        double area = pi * (r*r) * a / 360;
        System.out.println("Alan: "+area);
    }
}
