import java.util.Scanner;

public class ucakBiletiHesaplamaMerveBilgin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km, tip, yas;
        double ucret, yasIndirimi, tipIndirimi;
        System.out.print("Gidilecek Mesafeyi Giriniz: ");
        km = inp.nextInt();
        System.out.print("\nYolculuk Tipiniz Nedir? \n 1- Sadece Gidiş, \n 2- Gidiş-Dönüş: ");
        tip = inp.nextInt();
        System.out.print("\nKaç Yaşındasınız?: ");
        yas = inp.nextInt();

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            ucret = km * 0.10;
            if (yas < 12) {
                yasIndirimi = ucret * 0.5;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = ucret * 0.1;
            } else if (yas >= 65) {
                yasIndirimi = ucret * 0.3;
            } else {
                yasIndirimi = 0;
            }
            ucret = ucret - yasIndirimi;
            if (tip == 2) {
                tipIndirimi = ucret * 0.2;
                ucret = (ucret - tipIndirimi) * 2;
            }
            System.out.println("Bilet Ücreti: " + ucret + "TL");
        }
        else{
            System.out.println("Girdiğiniz değerler hatalı veya eksik, tekrar deneyiniz.");
        }
    }
}


