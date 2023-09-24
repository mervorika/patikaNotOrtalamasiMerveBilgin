import java.util.Scanner;

public class palindromSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }

        scanner.close();
    }

    static boolean isPalindrom(int sayi) {
        int tersSayi = 0;
        int geciciSayi = sayi;

        while (geciciSayi != 0) {
            int kalan = geciciSayi % 10;
            tersSayi = tersSayi * 10 + kalan;
            geciciSayi /= 10;
        }

        return (sayi == tersSayi);
    }
}