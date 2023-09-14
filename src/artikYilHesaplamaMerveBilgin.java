import java.util.Scanner;
public class artikYilHesaplamaMerveBilgin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        int sene=inp.nextInt();

        if ((sene%4==0&&sene%100!=0)||(sene%400==0)){
            System.out.println(sene+"Bu yıl artık yıldır");
        }
        else{
            System.out.println(sene+"Bu yıl artık yıl değildir.");
        }
    }
}
