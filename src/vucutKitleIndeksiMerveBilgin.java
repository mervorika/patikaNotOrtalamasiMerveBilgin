import java.util.Scanner;

public class vucutKitleIndeksiMerveBilgin {
    public static void main(String[] args) {
        float boy, kilo, sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu CM Cinsinden Giriniz: ");
        boy = inp.nextInt();

        System.out.print("Kilonuzu KG Cinsinden Giriniz: ");
        kilo = inp.nextInt();
        boy = boy / 100;
        sonuc = kilo / (boy * boy);
        System.out.print("Vücut kitle indeksiniz: " + sonuc);
        if(sonuc<18.5) {
            System.out.print(" --> Düşük kilodasınız, biraz karbonhidrat mı alsanız?");
        }
        else if(sonuc>= 18.5 && sonuc <= 24.9) {
            System.out.print(" --> Normal kilodasınız Maşallah");
        }
       else if(sonuc>= 25.0 && sonuc <= 29.9) {
            System.out.print(" --> Eh biraz kilolusunuz, üzülmeyin belki dönemseldir.");
        }
       else if(sonuc>= 30) {
            System.out.print(" --> Bayağı kilolusunuz biraz dikkat edin");
        }

    }
}