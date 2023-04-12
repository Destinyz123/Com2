
import java.util.Scanner;


public class Slot_reservation {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt() ; 
        int [] book = new int [n+1] ;
        int [] request = new int [n+1] ;
        int max = sc.nextInt() ;
        int round = sc.nextInt() ;
        for(int i = 0 ; i < round ; i ++ ){
            int k = sc.nextInt() ;
            if(book [k] < max ){
                book [k] ++ ;
                System.out.println("1") ;
            }
            else if(book [k] >= max ){
                request [k] ++ ;
                System.out.println("2") ;
            }
        }
        for(int i = 1 ; i <= n ; i ++ ){
            System.out.print(book [i]+" ");
            
        }
        System.out.println("");
        for(int i = 1 ; i <= n ; i ++ ){
            System.out.print(request [i]+" ");
            
        }

    }
    
}
