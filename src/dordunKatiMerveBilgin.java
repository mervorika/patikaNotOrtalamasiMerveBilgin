
import java.util.Scanner;

public class dordunKatiMerveBilgin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        while (true) {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            if (sayi % 2 == 1 ) {
                break;
            }

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);

        scanner.close();
    }
}