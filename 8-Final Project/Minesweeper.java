package FinalProject;

public class Minesweeper {
    int row;
    int col;
    String[][] matrix;
    int bombNumber;
    String[][] board;
    boolean isWin;

    Minesweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new String[row][col];
        this.bombNumber = (int) (row * col / 4);
        this.board = new String[row][col];
        this.isWin = true;
    }

    void createMap() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = "-";
            }
        }
        int k = 0;
        while (k < this.bombNumber) {
            int randNumberRow = (int) (Math.random() * this.row);
            int randNumberCol = (int) (Math.random() * this.col);
            if (this.matrix[randNumberRow][randNumberCol].equals("*")) {
                continue;
            } else {
                this.matrix[randNumberRow][randNumberCol] = "*";
            }
            k++;
        }
    }
    void printMap() {
        for (String[] i : this.matrix) {
            for (String j : i) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
    void createBoard() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = "-";
            }
        }
    }
    void printBoard() {
        for (String[] r : this.board) {
            for (String l : r) {
                System.out.print(l + "  ");
            }
            System.out.println();
        }
    }
    boolean findBomb(int row, int col) {
        boolean isFinish = true;
        if (row >= this.matrix.length || col >= this.matrix[0].length) {
            System.out.println("Geçerli bir değer giriniz!!");
            isFinish = false;
            return isFinish;
        }
        int[][] neighbours = {
                {row - 1, col - 1}, {row - 1, col}, {row - 1, col + 1},
                {row, col - 1}, {row, col + 1},
                {row + 1, col - 1}, {row + 1, col}, {row + 1, col + 1}};
        int bombCounter = 0;
        if (this.matrix[row][col].equals("-") || this.matrix[row][col].equals("*")) {
            for (int i = 0; i < 8; i++) {
                if (this.matrix[row][col].equals("*")) {
                    this.isWin = false;
                    return isFinish;
                }
                int tempRow = neighbours[i][0];
                int tempCol = neighbours[i][1];
                if (tempRow >= 0 && tempRow < this.matrix.length && tempCol >= 0 && tempCol < this.matrix[0].length) {
                    if (this.matrix[tempRow][tempCol].equals("*")) {
                        bombCounter++;
                    }
                }
            }
            String bombCounterStr = String.valueOf(bombCounter);
            this.board[row][col] = bombCounterStr;
            this.matrix[row][col] = bombCounterStr;

            for (String[] i : this.matrix) {
                for (String j : i) {
                    if (j.equals("-")){
                        isFinish = false;
                    }
                }
            }
            printBoard();
        } else {
            System.out.println("Girilen değer tekrardan girilemez!");
        }

        return isFinish;
    }
    void printResult(){
        if (isWin){
            System.out.println("Tebrikler kazandınız!! Harita: ");
            printMap();
        }
        else {
            System.out.println("Mayını buldunuz!! Harita: ");
            printMap();
        }
    }
}
