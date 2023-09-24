
import java.util.Scanner;

public class atmProjesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hesapBakiye = 50000.0;
        System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
        System.out.println("1. Bakiyeyi Göster");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Para Çekme");
        System.out.println("4. Çıkış");

        while (true) {
            System.out.print("Yapmak istediğiniz işlemi seçin (1-4): ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Hesap Bakiyeniz: " + hesapBakiye + " TL");
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    double yatirilanMiktar = scanner.nextDouble();
                    hesapBakiye += yatirilanMiktar;
                    System.out.println(yatirilanMiktar + " TL yatırıldı. Yeni bakiye: " + hesapBakiye + " TL");
                    break;
                case 3:
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    double cekilecekMiktar = scanner.nextDouble();
                    if (cekilecekMiktar <= hesapBakiye) {
                        hesapBakiye -= cekilecekMiktar;
                        System.out.println(cekilecekMiktar + " TL çekildi. Yeni bakiye: " + hesapBakiye + " TL");
                    } else {
                        System.out.println("Yetersiz bakiye! Bakiye: " + hesapBakiye + " TL");
                    }
                    break;

                case 4:
                    System.out.println("Tekrar görüşmek üzere.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            }
        }
    }
}