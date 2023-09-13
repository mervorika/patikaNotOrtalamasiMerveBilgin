import java.util.Scanner;

public class hipotenusHesabiMerveBilgin {
    public static void main(String[] args) {
        int a, b, c, u;
        double alan, cevre;

        Scanner kenarDegeri = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a = kenarDegeri.nextInt();

        System.out.print("2. Kenarı Giriniz: ");
        b = kenarDegeri.nextInt();

        System.out.print("3. Kenarı Giriniz: ");
        c = kenarDegeri.nextInt();

        u = (a + b + c) / 2;
        cevre = 2 * u;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}
