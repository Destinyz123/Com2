import java.util.Scanner;
public class OddEvenZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int [] wait = new int [n] ;
        int even = 0 ;
        int odd = 0 ;
        for(int i = 0 ; i < n ; i ++ ){
            wait [i] = sc.nextInt() ;
            if(wait [i] == 0 ){
                even ++ ;
                odd ++ ;
            }
            else if(wait [i] %2 == 0 && wait [i] != 0){
                even ++ ;
            }
            else if(wait [i] % 2 != 0 ){
                odd ++ ;
            }
        }
        int sing = 0 ;
        int coup = 0 ;
        int [] e = new int [even] ;
        int [] o = new int [odd] ;
        for(int i = 0 ; i < n ; i ++ ){
            if(wait [i] == 0){
                e [coup] = wait [i] ;
                o [sing] = wait [i] ;
                sing ++ ;
                coup ++ ;
            }
            else if(wait [i] %2 == 0 && wait [i] != 0 ){
                e [coup] = wait [i] ;
                coup ++ ;
            }
            else if(wait [i] % 2 != 0 ){
                o [sing] = wait [i] ;
                sing ++ ;
            }
        }
        for(int i = 0 ; i < odd ; i ++ ){
            System.out.print(o [i]+" ");
        }
        System.out.println("");
        for(int i = 0 ; i < even ; i ++ ){
            System.out.print(e [i]+" ");
        }
    }
    
}
