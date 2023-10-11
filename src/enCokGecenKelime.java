
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Scanner;

public class enCokGecenKelime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Metni girin: ");
        String metin = scanner.nextLine();

        Map<String, Long> kelimeSayilari = Arrays.stream(metin.split("\\s+"))
                .map(kelime -> kelime.replaceAll("[^a-zA-Z]", "").toLowerCase())
                .filter(kelime -> !kelime.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<String, Long> enCokGecenKelime = kelimeSayilari.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if (enCokGecenKelime != null) {
            System.out.println("En çok geçen kelimeyi buldum: " + enCokGecenKelime.getKey() + " (" + enCokGecenKelime.getValue() + " kez)");
        } else {
            System.out.println("Herhangi bir kelime bulamadım.");
        }
    }
}
