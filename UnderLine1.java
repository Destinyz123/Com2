
import java.util.Scanner;
public class UnderLine1 {
    String stack(String [] str , int k){
        int loop = k ;
        for(int i = 0 ; i < loop ; i ++){
            System.out.println(str[i]);
            System.out.println("--------------------");
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        String [] arr = new String [n] ;
        for(int i = 0 ; i < n ; i ++ ){
            arr [i] = sc.next() ;
        }
        UnderLine1 ud = new UnderLine1 () ;
        ud.stack(arr, n) ;
    }
}
