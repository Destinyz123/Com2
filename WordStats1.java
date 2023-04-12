
import java.util.Scanner;


public class WordStats1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        char [] letter = new char [26] ;
        int [] count = new int [26] ;
        int n = sc.nextInt() ;
//        String str = sc.nextLine() ;
//        int num = str.charAt(0) - 'A' ;
//        System.out.println(num);
        for(int i = 0 ; i < n ; i ++ ){
            String str = sc.next() ;
            char stuck = str.charAt(0) ;
            int num = stuck - 'A' ;
            
            letter [num] = str.charAt(0) ;
            count [num] ++ ;
        }
        for(int i = 0 ; i < 26 ; i ++ ){
            if(count [i] > 0){
                System.out.println(letter [i]+" "+count[i]);
            }
        }
    }
}
