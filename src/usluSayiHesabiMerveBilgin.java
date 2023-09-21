import java.util.Scanner;

import java.util.Scanner;

public class usluSayiHesabiMerveBilgin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Asıl sayıyı (a) girin: ");
        int asil = scanner.nextInt();

        System.out.print("Üssü (b) girin: ");
        int us = scanner.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= asil;
        }

        System.out.println(asil + "^" + us + " = " + sonuc);

        scanner.close();
    }
}