
import java.util.Scanner;

public class dortVeBesinKuvveti {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int length = scanner.nextInt();
        for(int i = 1; i< length; i*=4){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1; i< length; i*=5){
            System.out.print(i+" ");
        }
    }
}