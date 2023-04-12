
import java.util.Scanner;


public class Box2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in) ;
       int n = sc.nextInt() ;
       int [] max = new int [n+1] ;
       int [] boxes = new int [n+1] ;
       for(int i = 1 ; i <= n ; i ++ ){
           max [i] = sc.nextInt() ;
       }
       int k = sc.nextInt() ;
       for(int i = 0 ; i < k ; i ++ ){
           int a = sc.nextInt() ;
           int b = sc.nextInt() ;
           if(a == 1){
               int c = sc.nextInt() ;
               if(boxes[c] + b <= max[c]){
                   boxes [c] += b ;
                   System.out.println(boxes [c]);
               }
               else{
                   System.out.println("-1");
               }
           }
           else{
               for(int j = 1 ; j <= n ; j ++ ){
                   if(b - boxes [j] > 0){
                       b -= boxes [j] ;
                       boxes [j] = 0 ;
                   }
                   else{
                       boxes [j] -= b ;
                       b = 0 ;
                       System.out.println(j+" "+boxes [j]);
                       break ;
                   }
               }
               if(b > 0){
                   System.out.println(n+" 0");
               }
           }
       }
    }
    
}
