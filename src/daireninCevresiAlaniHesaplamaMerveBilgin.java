import java.util.Scanner;

public class daireninCevresiAlaniHesaplamaMerveBilgin {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        cevre = 2 * pi * r;
        alan = r * r * pi;
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dairenin Alanı: " + alan);
    }
}