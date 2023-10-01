public class bHarfi {
    public static void main(String[] args) {
        int size = 7;

        char[][] letterB = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                letterB[i][j] = ' ';
            }
        }

        // olmadı
        for (int i = 0; i < size; i++) {
            letterB[i][0] = '*';
            letterB[0][i] = '*';
            letterB[size - 1][i] = '*';
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(letterB[i][j]);
            }
            System.out.println();
        }
    }
}
