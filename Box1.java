
import java.util.Scanner;


public class Box1 {

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
           int c = sc.nextInt() ;
           if(a == 1){
               if(boxes[c] + b <= max[c]){
                   boxes [c] += b ;
                   System.out.println(boxes [c]);
                   continue ;
               }
           }
           else{
               if(boxes[c] - b >= 0){
                   boxes[c] -= b ;
                   System.out.println(boxes [c]);
                   continue ;
               }
           }
           System.out.println("-1");
       }
    }
    
}
