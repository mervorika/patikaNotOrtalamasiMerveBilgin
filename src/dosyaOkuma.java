import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class dosyaOkuma {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        int sum = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = br.readLine()) != null) {

                int number = Integer.parseInt(line);
                sum += number;
            }

            br.close();

            System.out.println("Sum of numbers in the file: " + sum);

        } catch (IOException e) {
            System.err.println("File reading error: " + e.getMessage());
        }
    }
}
