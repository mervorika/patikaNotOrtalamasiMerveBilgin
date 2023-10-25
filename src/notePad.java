import java.io.*;
import java.util.Scanner;

public class notePad {
    public static void main(String[] args) {
        String fileName = "notepad.txt";

        try (Scanner scanner = new Scanner(System.in);
             FileWriter fileWriter = new FileWriter(fileName);
             PrintWriter printWriter = new PrintWriter(fileWriter);
             FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {


            String line;
            StringBuilder savedText = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                savedText.append(line).append("\n");
            }
            System.out.println("En son kaydedilen metin:\n" + savedText.toString());

            System.out.println("Yeni metin girin (çıkmak için 'exit' yazın):");

            StringBuilder newText = new StringBuilder();
            String input;
            while (true) {
                input = scanner.nextLine();
                if ("exit".equals(input)) {
                    break;
                }
                newText.append(input).append("\n");
            }


            printWriter.print(newText.toString());
            System.out.println("Metin başarıyla kaydedildi.");

        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
