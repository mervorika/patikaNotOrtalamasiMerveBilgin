import java.util.Scanner;

public class manavKasaProgramiMerveBilgin {
    public static void main(String[] args) {

        int armut, elma, domates, muz, patlican;
        double tutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo: ");
        armut = inp.nextInt();

        System.out.print("Elma Kaç Kilo: ");
        elma = inp.nextInt();

        System.out.print("Domates Kaç Kilo: ");
        domates = inp.nextInt();

        System.out.print("Muz Kaç Kilo: ");
        muz = inp.nextInt();

        System.out.print("Patlıcan Kaç Kilo: ");
        patlican = inp.nextInt();

        tutar = (armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.0);

        System.out.print("Toplam tutar: " + tutar);

    }
}
