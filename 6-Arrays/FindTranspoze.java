package Arrays;

public class FindTranspoze {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{2, 3, 4}, {5, 6, 4}};
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpoze = new int[col][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpoze[j][i] = matrix[i][j];
            }
        }
        for (int[] line : transpoze) {
            for (int number : line) {
                System.out.print(number + "  ");
            }
            System.out.println();
        }
    }
}
