
    import java.util.Scanner;

    public class armstrongSayilar {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();
            scanner.close();


            int toplam = 0;

            while (sayi > 0) {
                int basamak = sayi % 10;
                toplam += basamak;
                sayi /= 10;
            }

            System.out.println("Basamakların Toplamı: " + toplam);
        }
    }
