
import java.util.Scanner;

public class yildizlarlaUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin (tek sayı): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 0) {
            System.out.println("Lütfen tek bir sayı girin.");
            return;
        }

        for (int i = 1; i <= n; i += 2) {
            int boslukSayisi = (n - i) / 2;
            int yildizSayisi = i;
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 1; i -= 2) {
            int boslukSayisi = (n - i) / 2;
            int yildizSayisi = i;
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}