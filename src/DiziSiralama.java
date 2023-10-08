
import java.util.Scanner;
        import java.util.Arrays;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);

        // Sıralanmış diziyi ekrana yazdır
        System.out.print("Sıralanmış dizi: ");
        for (int i = 0; i < boyut; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
