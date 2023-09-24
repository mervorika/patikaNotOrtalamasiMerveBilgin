import java.util.Scanner;

public class harmonikSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        double n = scanner.nextDouble();
        scanner.close();

        double harmonikToplam = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonikToplam += 1.0 / i;
        }

        System.out.println("Harmonik Seri Toplamı: " + harmonikToplam);
    }
}