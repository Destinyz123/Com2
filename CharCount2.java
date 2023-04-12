
import java.util.Scanner;


public class CharCount2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int [] get = new int [100] ;
        int count = 0 ;
        for(;;){
            String str = sc.nextLine() ;
            for(int i = 0 ; i < str.length() ; i ++ ){
                char c = str.charAt(i) ;
                get[(int)c] ++ ;
                if(get[(int)c] == n){
                    System.out.println(c);
                    System.out.println(count);
                    System.exit(0);
                }
            }
            count ++ ;
        }
    }    
}
