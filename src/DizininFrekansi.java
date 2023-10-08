
import java.util.Scanner;
        import java.util.HashMap;
        import java.util.Map;

public class DizininFrekansi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            dizi[i] = scanner.nextInt();
        }

        // Elemanların frekanslarını hesapla
        Map<Integer, Integer> frekanslar = new HashMap<>();
        for (int eleman : dizi) {
            if (frekanslar.containsKey(eleman)) {
                frekanslar.put(eleman, frekanslar.get(eleman) + 1);
            } else {
                frekanslar.put(eleman, 1);
            }
        }

        // Frekansları ekrana yazdır
        System.out.println("Elemanların Frekansları:");
        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " kez");
        }
    }
}
