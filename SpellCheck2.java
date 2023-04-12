
import java.util.Scanner;
public class SpellCheck2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] spell = new String[n];
        for (int i = 0; i < n; i++) {
            spell[i] = sc.next();
        }
        int k = sc.nextInt() ;
        for(int i = 0 ; i < k ; i ++ ){
            String word = sc.next() ;
            int maxscore = -1 ;
            String ans = "" ;
            boolean check = false ;
            
            for(int j = 0 ; j < n ; j ++ ){
                String word2 = spell [j] ;
                
                boolean eq = word.equals(word2) ;
                if(eq){
                    check = true ;
                }
                
                int l = word.length() ;
                if(word2.length() < l){
                    l = word2.length() ;
                }
                int score = 0 ;
                for(int m = 0 ; m < l ; m ++ ){
                    char c1 = word.charAt(m) ;
                    char c2 = word2.charAt(m) ;
                    if(c1 == c2){
                        score ++ ;
                    }
                }
                if(maxscore < score){
                    maxscore = score ;
                    ans = word2 ;
                }
            }
            if(check){
                System.out.println(word);
            }
            else{
                System.out.println(ans);
            }
        }
    }
    
}
