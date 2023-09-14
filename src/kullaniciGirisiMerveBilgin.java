import java.util.Scanner;

public class kullaniciGirisiMerveBilgin {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int reset;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? : \n 1-Sıfırla\n 2-Hayır");
            reset = inp.nextInt();
            switch (reset) {
                case 1:
                    System.out.println("Yeni şifrenizi giriniz. Girdiğiniz şifre unuttuğunuz şifreyle aynı olmamalıdır! : ");
                    newPassword = inp.nextLine();
                    // boolean esittir = password.equals(newPassword);
                    // System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    if (newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                    break;
                case 2:
                    System.out.println("Görüşmek üzere!");
                    break;
                default:
            }
        }
    }
}