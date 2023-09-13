import java.util.Scanner;

public class dersOrtalamasiHesabiMerveBilgin {
    public static void main(String[] args) {

        int muzik, tarih, kimya, turkce, matematik, fizik;
        String gecti, kaldi, durum;
        double sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();

        int toplam = (muzik + tarih + kimya + turkce + matematik + fizik);
        sonuc = toplam / 6.0;
        System.out.print("Derslerinizin ortalaması: " + sonuc);
        System.out.println(sonuc > 60 ? " Sınıfı Geçti" : " Sınıfta Kaldı");


    }
}
