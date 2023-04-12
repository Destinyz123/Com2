
import java.util.Scanner;


public class SubMatch2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String str = sc.nextLine() ;
        String want = sc.nextLine() ;
        String [] keep = new String [want.length()-2] ;
        for(int i = 0 ; i < want.length() - 2 ; i ++ ){
            keep [i] = want.substring(i,i+3) ;
            //System.out.println(keep [i]);
        }
        for(int i = 0 ; i < want.length() - 2 ; i ++ ){
            if(str.indexOf(keep [i],0) != -1){
                System.out.println(str.indexOf(keep [i], 0)+1) ;
            }
            else{
                System.out.println("No");
            }
        }
    }
    
}
