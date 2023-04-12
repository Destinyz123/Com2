
import java.util.Scanner;


public class ArrayCompress2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int [] numb = new int [n] ;
        for(int i = 0 ; i < n ; i ++ ){
            numb [i] = sc.nextInt() ;
        }
        int want1 = sc.nextInt() ;
        int want2 = sc.nextInt() ;
        int want3 = sc.nextInt() ;
        int sum = 0 ;    
        int count = 0 ;
        for(int i = 0 ; i < n ; i ++ ){
            if(numb [i] == want1 || numb [i] == want2 || numb [i] == want3 )
            {
                if(i == 0){
                    System.out.print(numb[i]+" ");
                }
                if(count > 0){
                    System.out.print(sum +" "+ numb[i]+" ");
                    count = 0 ;
                    sum = 0 ;
                }
            }
            else if(i == n-1){
                System.out.print(sum + numb[i]);
            }
            else{
                sum += numb [i] ;
                count ++ ;
            }
        }
    }
    
}
