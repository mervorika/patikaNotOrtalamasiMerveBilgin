
import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını girin: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = 1; i <= basamakSayisi; i++) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * (basamakSayisi - i) + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}