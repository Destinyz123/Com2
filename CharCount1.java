
import java.util.Scanner;


public class CharCount1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String str = sc.next() ;
        char [] ch = new char [26] ;
        int [] count = new int [26] ;
        for(int i = 0 ; i < str.length() ; i ++ ){
            int val = (int)str.charAt(i) ;
            int channel = val - 65 ;
            ch [channel] = str.charAt(i) ;
            count [channel] ++ ;
        }
        for(int i = 0 ; i < 26 ; i ++ ){
            if(count[i] > 0 ){
                System.out.println(ch[i]+" "+count[i]);
            }
        }
    }
    
}
