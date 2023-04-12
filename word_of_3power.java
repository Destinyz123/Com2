
import java.util.Scanner;


public class word_of_3power {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int count = 1 ;
        String wordda = "Dana" ;
        String wordsil = "Sila" ;
        String wordbhav = "Bhavana" ;
        int [] da = new int [1] ;
        int [] sil = new int [1] ;
        int [] bhav = new int [1] ;
        for(;;){
            String str = sc.nextLine() ;
            if(str.indexOf(wordda) != -1){
                if(da [0] == 0){
                    da [0] = count ;
                }
            }
            if(str.indexOf(wordsil) != -1){
                if(sil [0] == 0){
                    sil [0] = count ;
                }
            }
            if(str.indexOf(wordbhav) != -1){
                if(bhav [0] == 0){
                    bhav [0] = count ;
                }
            }
            
            if(bhav [0] != 0 && da[0] != 0 && sil [0] != 0){
                break ;
            }
            count ++ ;
        }
        System.out.println(da[0]);
        System.out.println(sil[0]);
        System.out.println(bhav[0]);
        System.out.println(count);
    }
    
}
