
import java.util.Scanner;

public class Targetprice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] land = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            land[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            int k = sc.nextInt();
            int m = sc.nextInt();
            int start = m - (k / 2);
            int end = m + (k / 2);
            int sum = 0;
            if (start < 1 || n < end) {
                System.out.print("no ");
            }
            if (start < 1) {
                start = 1;
            }
            if (n < end) {
                end = n;
           }
            for(int j = start ; j <= end ; j ++ ){
                sum += land [j] ;
            }
            System.out.println(sum);
        }
    }
}
