
import java.util.Scanner;

public class sinifiGecmeNotuMerveBilgin {
    public static void main(String[] args) {

        int muzik, kimya, turkce, matematik, fizik;
        String gecti, kaldi, durum;
        double sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();
        if (matematik < 0 && matematik> 100) {

        }
        else{

        }
        double toplam = (muzik + kimya + turkce + matematik + fizik);
        sonuc = toplam / 5.0;
        System.out.print("Derslerinizin ortalaması: " + sonuc);
        System.out.println(sonuc > 55 ? " Sınıfı Geçti" : " Sınıfta Kaldı");


    }
}
