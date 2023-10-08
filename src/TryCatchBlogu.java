import java.util.Scanner;
public class TryCatchBlogu {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        try {
            int indeks = kullaniciIndeksGirisi(); // Kullanıcıdan indeks alınır
            int eleman = indekstekiElemaniGetir(dizi, indeks);
            System.out.println("Belirtilen indeksteki eleman: " + eleman);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Hata: Belirtilen indeks dizi boyutunun dışındadır.");
        }
    }

    public static int kullaniciIndeksGirisi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin indeksini girin: ");
        return scanner.nextInt();
    }

    public static int indekstekiElemaniGetir(int[] dizi, int indeks) {
        if (indeks < 0 || indeks >= dizi.length) {
            throw new ArrayIndexOutOfBoundsException(); // Hata durumunda istisna fırlatılır
        }
        return dizi[indeks];
    }
}
