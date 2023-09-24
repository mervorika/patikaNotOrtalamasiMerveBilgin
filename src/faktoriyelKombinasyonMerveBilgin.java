
public class faktoriyelKombinasyonMerveBilgin {
    public static void main(String[] args){
        System.out.println("4 ün 2'li kombinasyonu: " + kombinasyon(4,2));
    }
    public static int kombinasyon(int n, int r){
        //C(n,r) = n! / (r! * (n-r)!)
        return  faktoriyel(n) / ( faktoriyel(r) * faktoriyel(n-r));
    }
    public static int faktoriyel(int n){
        int toplam = 1;
        for( int i = 1; i<= n; i++ ){
            toplam = toplam * i;
        }
        return toplam;
    }
}