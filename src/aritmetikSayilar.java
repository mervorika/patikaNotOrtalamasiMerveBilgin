
import java.util.Scanner;

public class aritmetikSayilar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        System.out.println("a+b*c-b: "+(sayi1+sayi2*sayi3-sayi2));
        System.out.println("(a+b)*c-b: "+((sayi1+sayi2)*sayi3-sayi2));
        System.out.println("a+b*(c-b): "+(sayi1+sayi2*(sayi3-sayi2)));
    }
}