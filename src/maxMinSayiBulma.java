
import java.util.Scanner;

public class maxMinSayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Bir sayı giriniz.");
            return;
        }

        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Sayı girin: ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En Büyük Sayı: " + enBuyuk);
        System.out.println("En Küçük Sayı: " + enKucuk);

        scanner.close();
    }
}