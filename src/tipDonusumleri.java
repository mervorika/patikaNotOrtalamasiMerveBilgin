
import java.util.Scanner;

public class tipDonusumleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı girin: ");
        int tamSayi = scanner.nextInt();

        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = scanner.nextDouble();

        double tamSayiOndalikli = (double) tamSayi;
        int ondalikliSayiTam = (int) ondalikliSayi;

        System.out.println("Tam Sayıyı Ondalıklı Sayıya Dönüştür: " + tamSayiOndalikli);
        System.out.println("Ondalıklı Sayıyı Tam Sayıya Dönüştür: " + ondalikliSayiTam);

        scanner.close();
    }
}