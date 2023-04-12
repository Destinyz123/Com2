
import java.util.Scanner;


public class KeyWord1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        String [] keep = new String [n] ;
        int count = 0 ;
        for(int i = 0 ; i < n ; i ++ ){
            String word = sc.next() ;
            boolean check = true ;
            for(int j = 0 ; j < count ; j ++ ){
                if(word.equals(keep[j])){
                    check = false ;
                }
            }
            if(check == true){
                keep [count] = word ;
                count ++ ;
            }
        }
        for(int i = 0 ; i < count ; i ++ ){
            System.out.print(keep[i]+" ") ;
        }
    }
    
}
