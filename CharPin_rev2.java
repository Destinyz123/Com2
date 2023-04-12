
import java.util.Scanner;


public class CharPin_rev2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String str = sc.next() ;
        String word = sc.next() ;
        char [] stuck = str.toCharArray() ;   
        for(int i = str.length()-1 ; i >= 0  ; i -- ){
            if(stuck [i] == word.charAt(2) && stuck [i-1] == word.charAt(1) && stuck [i-2] == word.charAt(0)){
                System.out.print(word);
                i -=2 ;
            }
            else{
                System.out.print(stuck [i]);
            }
        }
    }
    
}
