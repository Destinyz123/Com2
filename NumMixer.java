
import java.util.Scanner;


public class NumMixer {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int [] mix1 = new int [n] ;
        int [] mix2 = new int [n] ;
        for(int i = 0 ; i < n ; i ++ ){
            mix1 [i] = sc.nextInt() ;
        }
        for(int i = 0 ; i < n ; i ++ ){
            mix2 [i] = sc.nextInt() ;
        }
        int order = sc.nextInt() ;
        if(order > 0 ){
            for(int i = 0 ; i < n ; i ++ ){
                System.out.print(mix1 [i]+" " );
            }
            for(int i = n-1 ; i >= 0 ; i -- ){
                System.out.print(mix2 [i]+" " );
            }
        }
    }
    
}
