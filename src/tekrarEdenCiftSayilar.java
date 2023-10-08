
import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import java.util.Scanner;

public class tekrarEdenCiftSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı dizisini boşluklarla ayırarak girin: ");
        String input = scanner.nextLine();

        String[] sayilar = input.split(" ");
        List<Integer> sayiDizisi = new ArrayList<>();

        for (String sayi : sayilar) {
            try {
                int num = Integer.parseInt(sayi);
                sayiDizisi.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Geçersiz bir sayı girdiniz: " + sayi);
            }
        }

        List<Integer> tekrarEdenCiftSayilar = tekrarEdenCiftleriBul(sayiDizisi);

        if (!tekrarEdenCiftSayilar.isEmpty()) {
            System.out.print("Tekrar eden çift sayılar: ");
            for (int i = 0; i < tekrarEdenCiftSayilar.size(); i++) {
                System.out.print(tekrarEdenCiftSayilar.get(i));
                if (i < tekrarEdenCiftSayilar.size() - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("Tekrar eden çift sayı bulunamadı.");
        }
    }

    public static List<Integer> tekrarEdenCiftleriBul(List<Integer> sayiDizisi) {
        List<Integer> tekrarEdenCiftSayilar = new ArrayList<>();
        Map<Integer, Integer> sayiSayilari = new HashMap<>();

        for (int sayi : sayiDizisi) {
            if (sayi % 2 == 0) {
                if (sayiSayilari.containsKey(sayi)) {
                    sayiSayilari.put(sayi, sayiSayilari.get(sayi) + 1);
                } else {
                    sayiSayilari.put(sayi, 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : sayiSayilari.entrySet()) {
            if (entry.getValue() > 1) {
                tekrarEdenCiftSayilar.add(entry.getKey());
            }
        }

        return tekrarEdenCiftSayilar;
    }
}
