import java.util.Scanner;

public class kdvHesabiMerveBilgin {
    public static void main(String[] args) {
        double kdvsizFiyat, kdvTutari, kdvliFiyat;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücreti Giriniz : ");
        kdvsizFiyat = input.nextDouble();
        double kdvOran = 0;
        if (kdvsizFiyat > 0 && kdvsizFiyat < 1000) {
            kdvOran = 0.18;
        } else if (kdvsizFiyat > 1000) {
            kdvOran = 0.08;
        }
        kdvTutari = kdvsizFiyat * kdvOran;
        kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV'siz Ücret Tutari : " + kdvsizFiyat);
        System.out.println("KDV Tutari : " + kdvTutari);
        System.out.println("KDV'li Ücret Tutari : " + kdvliFiyat);

    }

}
