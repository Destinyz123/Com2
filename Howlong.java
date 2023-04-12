
import java.util.Scanner;


public class Howlong {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int [] arr = new int [n+1] ;
        for(int i = 1 ; i <= n ; i ++ ){
            arr [i] = sc.nextInt() ;
        }
        for(int i = 0 ; i < 3 ; i ++ ){
            int x = sc.nextInt() ;
            int count = 0 ;
            for(int j = x ; j <= n ; j ++ ){
                if(arr[j] == 0){
                    break ;
                }
                count ++ ;
            }
            System.out.println(count);
        }
    }
    
}
