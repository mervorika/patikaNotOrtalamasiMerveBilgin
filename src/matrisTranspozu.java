
public class matrisTranspozu {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int row = matris.length;
        int col = matris[0].length;

        int[][] transpozMatris = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTranspozu:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpozMatris[i][j] + "\t");
            }
            System.out.println();
        }
    }
}