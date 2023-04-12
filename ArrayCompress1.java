
import java.util.Scanner;
public class ArrayCompress1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] numb = new int [n] ;
        
        for(int i = 0 ; i < n ; i++){
            numb [i] = sc.nextInt() ;
        }
        int want = sc.nextInt() ;
        int sum = 0 ;
        for(int i = 0 ; i < n ; i ++ ){
            if(numb [i] == want){
                System.out.print(sum+" "+want+" ");
                sum = 0 ;
            }
            else{
                sum += numb [i] ;
            }
        }
        System.out.print(sum);
    }
    
}
