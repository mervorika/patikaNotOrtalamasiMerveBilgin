import java.util.Scanner;

public class ucVeDordunKuvvetleriMerveBilgin {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *=3) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i *=4) {
            System.out.print(i + " ");
        }

    }
}