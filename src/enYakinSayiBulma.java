
import java.util.Arrays;
        import java.util.Scanner;

public class enYakinSayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();

        int[] diziyiAl = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
            diziyiAl[i] = scanner.nextInt();
        }

        System.out.print("Bir sayı giriniz: ");
        int hedef = scanner.nextInt();

        Arrays.sort(diziyiAl);

        int enBuyukKucuk = -1;
        int enKucukBuyuk = -1;

        for (int i = 0; i < n; i++) {
            if (diziyiAl[i] < hedef) {
                enBuyukKucuk = diziyiAl[i];
            } else if (diziyiAl[i] > hedef) {
                enKucukBuyuk = diziyiAl[i];
                break;
            }
        }

        if (enBuyukKucuk != -1) {
            System.out.println("Girilen sayıdan küçük en büyük sayı: " + enBuyukKucuk);
        } else {
            System.out.println("Girilen sayıdan küçük en büyük sayı bulunamadı.");
        }

        if (enKucukBuyuk != -1) {
            System.out.println("Girilen sayıdan büyük en küçük sayı: " + enKucukBuyuk);
        } else {
            System.out.println("Girilen sayıdan büyük en küçük sayı bulunamadı.");
        }
    }
}
