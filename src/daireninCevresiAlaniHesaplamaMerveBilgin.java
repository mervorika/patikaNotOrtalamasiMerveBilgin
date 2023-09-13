import java.util.Scanner;

public class daireninCevresiAlaniHesaplamaMerveBilgin {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz: ");
        a = input.nextInt();
        alan = (pi * (r * r) * a) / 360;
        System.out.println("Daire Diliminin Alanı: " + alan);

    }
}