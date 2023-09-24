
import java.util.Scanner;

public class deseneGoreMetod {
    public static void deseneGoreMetod(int sayi){
        System.out.print(sayi+" ");
        if(sayi <= 0){
            return;
        }
        deseneGoreMetod(sayi-5);
        System.out.print(sayi+" ");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int sayi = scanner.nextInt();
        deseneGoreMetod(sayi);

    }
}