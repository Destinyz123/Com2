
import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] land = new int[n + 1];
        int [] labors = new int [n + 1] ;
        int [] power = new int [n+1] ;
        for (int i = 1; i <= n; i++) {
            land[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            labors [i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            power [i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            int k = sc.nextInt();
            int m = sc.nextInt();
            int start = m - (k / 2);
            int end = m + (k / 2);
            int sum = 0;
            boolean isout = start < 1 || n < end ;
            if (isout) {
                System.out.print("no ");
            }
            if (start < 1) {
                start = 1;
            }
            if (n < end) {
                end = n;
           }
            boolean islabor = true ;
            boolean ispow = false ;
            for(int j = start ; j <= end ; j ++ ){
                sum += land [j] ;
                if(labors [j] < 5){
                    islabor = false ;
                }
                if(power [j] > 0){
                    ispow = true ;
                }
            }
            if(!isout){
                System.out.print(sum) ;
                if(islabor){
                    System.out.print(" labor") ;
                }
                if(ispow){
                    System.out.print(" power");
                }
                System.out.println("");
            }
            else{
                System.out.println(sum);
            }
        }
    }
}
