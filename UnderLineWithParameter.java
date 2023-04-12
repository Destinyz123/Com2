
import java.util.Scanner;
public class UnderLineWithParameter {
    void stack(String [] str , int k , int [] n){
        int loop = k ;
        for(int i = 0 ; i < loop ; i ++){
            System.out.println(str[i]);
            for(int j = 0 ; j < n[i] ; j ++ ){
                System.out.print("-");
            }
            System.out.println("");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        String [] arr = new String [n] ;
        int [] num = new int [n] ;
        for(int i = 0 ; i < n ; i ++ ){
            arr [i] = sc.next() ;
            num [i] = sc.nextInt() ;
        }
        UnderLineWithParameter ud = new UnderLineWithParameter () ;
        ud.stack(arr,n,num) ;
    }
}

