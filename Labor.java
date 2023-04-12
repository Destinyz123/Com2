
import java.util.Scanner;

public class Labor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] land = new int[n + 1];
        int [] labors = new int [n + 1] ;
        for (int i = 1; i <= n; i++) {
            land[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            labors [i] = sc.nextInt();
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
            for(int j = start ; j <= end ; j ++ ){
                sum += land [j] ;
                if(labors [j] < 5){
                    islabor = false ;
                }
            }
            if(islabor && !isout){
                System.out.println(sum +" labor");
            }
            else{
                System.out.println(sum);
            }
        }
    }
}
