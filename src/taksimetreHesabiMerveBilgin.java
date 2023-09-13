import java.util.Scanner;

public class taksimetreHesabiMerveBilgin {
    public static void main(String[] args) {
        int km;
        double kmBasiUcret = 2.20, bazUcret = 10, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km yol alındı?: ");
        km = input.nextInt();
        total = (km * kmBasiUcret);
        total += bazUcret;
        if (total <= 20) {
            total = 20;
        }
        System.out.println("Toplam Tutar: " + total);
    }
}
