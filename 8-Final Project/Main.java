package FinalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mainRow = 0,mainCol = 0;
        while (true) {
            System.out.print("Oynamak istediğiniz haritanın satır büyüklüğünü giriniz: ");
            mainRow = input.nextInt();
            System.out.print("Oynamak istediğiniz haritanın sütun büyüklüğünü giriniz: ");
            mainCol = input.nextInt();
            if(mainCol>=2 && mainRow>=2){
                break;
            }
            else {
                System.out.println("En az '2x2'lik bir harita oluşturabilirsiniz!");
            }
        }
        Minesweeper minesweeper = new Minesweeper(mainRow,mainCol);
        minesweeper.createMap();
        minesweeper.createBoard();
        minesweeper.printBoard();
        boolean isFinish = false;
        int i = 1;
        while (!isFinish){
            System.out.println((i++)+". Tur");
            System.out.println("-------------------------------");
            System.out.print("Row: ");
            int row = input.nextInt();
            System.out.print("Col: ");
            int col = input.nextInt();
            isFinish = minesweeper.findBomb(row,col);
        }
        minesweeper.printResult();
    }
}
