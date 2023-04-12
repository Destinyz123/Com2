
import java.util.Scanner;

public class TargetLand {

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
            if (start > 0 && end <= n) {
                for (int j = start; j <= end; j++) {
                    sum += land [j] ;
                }
                System.out.println(sum);
            }
            else{
                System.out.println("no");
            }
        }
    }
}
