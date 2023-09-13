import java.util.Scanner;

public class hipotenusHesabiMerveBilgin {
    public static void main(String[] args) {
        int x, y;
        double z;

        Scanner kenarDegeri = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        x = kenarDegeri.nextInt();

        System.out.print("1. Kenarı Giriniz: ");
        y = kenarDegeri.nextInt();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("Hipotenüs: " + z);
    }
}
