
import java.util.Scanner;
public class train_ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt() ;
        int seat = sc.nextInt() ;
        int order = sc.nextInt() ;
        int [] count = new int [end+1] ;
        for(int i = 0 ; i < order ; i ++){
            int x = sc.nextInt() ;
            int y = sc.nextInt() ; 
            int z = sc.nextInt() ;
            boolean okay = true ;
            for(int station = x ; station < y ; station ++){
                if(count [station] + z > seat){
                    okay = false ;
                }
            }
            if(okay){
                for(int station = x ; station < y ; station++){
                    count[station] += z ;
                }
                System.out.println("Y") ;
            }
            else{
                System.out.println("N") ;
            }
        }
    }
    
}
