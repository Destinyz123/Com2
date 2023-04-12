
import java.util.Scanner;


public class FavorName {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String [] day = new String [4] ;
        char [][] good = new char [4][50] ;
        char [][] noob = new char [4][50] ;
        int [] val_n = new int [4+1] ;
        int [] val_g = new int [4+1] ;
        int count_g = 0 ;
        int count_n = 0 ;
        for(int i = 0 ; i < 4 ; i ++ ){
            day [i] = sc.next() ;
            int p = sc.nextInt() ;
            val_g[i] = p ;
            for(int j = 0 ; j < p ; j ++ ){
                good [i][j] = sc.next().charAt(0) ;
            }
            int n = sc.nextInt() ;
            val_n[i] = n ;
            for(int r = 0 ; r < n ; r ++){
                noob[i][r] = sc.next().charAt(0) ;
            }
        }
        String word = sc.next() ;
        String date = sc.next() ;
        int stack_i = 0 ;
        char [] keep_noob = new char [50] ;
        char [] keep_good = new char [50] ;
        for(int i = 0 ; i < 4 ; i ++ ){
            if(day[i].equals(date)){
                stack_i = i ;
            }            
        }
        for(int i = 0 ; i < val_n[stack_i] ; i ++){
            boolean check = true ;
            for(int j = 0 ; j < count_n ; j ++ ){
                if(noob[stack_i][i] == keep_noob[j]){
                    check = false ;
                }
            }
            if(check == true){
                keep_noob[count_n] = noob[stack_i][i] ;
                count_n ++ ;
            }
        }
        for(int i = 0 ; i < val_g[stack_i] ; i ++){
            boolean check = true ;
            for(int j = 0 ; j < count_g ; j ++ ){
                if(good[stack_i][i] == keep_good[j]){
                    check = false ;
                }
            }
            if(check == true){
                keep_good[count_g] = good[stack_i][i] ;
                count_g ++ ;
            }
        }
        int g = 0 ;
        int n = 0 ;
        for(int i = 0 ; i < word.length() ; i ++ ){
            for(int j = 0 ; j < count_n ; j ++ ){
                if(word.charAt(i) == keep_noob[j]){
                    n ++ ;
                }
            }
            for(int c = 0 ; c < count_g ; c ++ ){
                if(word.charAt(i) == keep_good[c]){
                    g ++ ; 
                }
            }
        }
        System.out.println(g);
        System.out.println(n);
    }
    
}
