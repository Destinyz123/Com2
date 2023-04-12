
import java.util.Scanner;


public class AgeReport {
    static int reportage(int [] id , int [] age ,int low ,int high){
        int count = 0 ;
        for(int i = 0 ;i < age.length ; i ++ ){
            if(age[i] >= low && age[i] <= high){
                System.out.println(id[i]);
                count ++ ;
            }
        }
        return count ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int [] iden = new int [n] ;
        int [] old = new int [n] ;
        for(int i = 0 ; i < n ; i ++ ){
            iden [i] = sc.nextInt() ;
            old [i] = sc.nextInt() ;
        }
        int min = sc.nextInt() ;
        int max = sc.nextInt() ;
        int val = reportage(iden , old , min , max) ;
        System.out.println("There are "+val+" persons in age range of "+min+" to "+max);
    }
    
}
