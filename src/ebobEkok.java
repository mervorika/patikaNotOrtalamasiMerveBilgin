
import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int ebob = 1;
        int bolen = 2;

        while (bolen <= sayi1 && bolen <= sayi2) {
            if (sayi1 % bolen == 0 && sayi2 % bolen == 0) {
                ebob = bolen;
            }
            bolen++;
        }

        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        scanner.close();
    }
}