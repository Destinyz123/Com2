
import java.util.Scanner;


public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int val = sc.nextInt();
        int max = Integer.MIN_VALUE ;
        int max_i = 0 ;
        int [] point = new int [people+1] ;
        for(int i = 0 ; i < val ; i++){
            int a = sc.nextInt();
            point [a]++ ;
        }
        for(int i = 1 ; i <= people ; i++){
            if(point [i] > max){
                max = point [i] ;
                max_i = i ;
            }
        }
        System.out.println(max_i) ;
        System.out.println(max) ;
    }
    
}
