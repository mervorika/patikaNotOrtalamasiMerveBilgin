/*import java.util.Scanner;
public class sinifiGecmeNotuMerveBilgin {
    public static void main(String[] args) {
        // 0 - muzik, 1 - kimya, 2 - turkce, 3 - matematik, 4 - fizik;
        String dersIsimleri[] = new String[] {"Müzik","Kimya", "Türkçe", "Matematik", "Fizik"};
        //int dersNotlari[] = new int[] {0,0,0,0,0};

        String gecti, kaldi, durum;
        double sonuc;

        Scanner inp = new Scanner(System.in);
        boolean hasAllFieldsGiven = false;
        int dersIndex = 0;
        int value = -1;
        int validDersler = 0;
        int validNotlarToplami = 0;
        for ()
                System.out.print(dersIsimleri[dersIndex]+" Notunuzu Giriniz: ");
                value = inp.nextInt();
                if (value >= 0 && value <= 100){ //valid
                      validDersler++;
                      validNotlarToplami += value;
                }
                dersIndex++;
        }

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
*/