
import java.util.Scanner;


public class Auction1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int [] start = new int [n] ;
        for(int i = 0 ; i < n ; i ++ ){
            start [i] = sc.nextInt() ;
        }
        int round = sc.nextInt() ;
        for(int i = 0 ; i < round ; i ++ ){
            for(int j = 0 ; j < n ; j ++ ){
                int auc = sc.nextInt() ;
                if(auc > start [j]){
                    start [j] = auc ;
                    System.out.print(start [j]+" ");
                }
                else{
                    System.out.print(start [j]+" ");
                }
            }
            System.out.println("");
        }
    }

}
