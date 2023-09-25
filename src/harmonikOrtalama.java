public class harmonikOrtalama {
    public static void main(String[] args) {
        double[] numbers = { 2.5, 3.0, 4.0, 6.0, 8.0 }; // Dizi örneği

        double harmonikOrtalama = calculateHarmonicMean(numbers);

        System.out.println("Dizinin Harmonik Ortalaması: " + harmonikOrtalama);
    }

    public static double calculateHarmonicMean(double[] arr) {
        double sumOfReciprocals = 0.0;
        int length = arr.length;

        for (double number : arr) {
            sumOfReciprocals += 1.0 / number;
        }

        return length / sumOfReciprocals;
    }
}