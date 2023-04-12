
import java.util.Scanner;

public class ArrayJump2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt() ;
        int[] value = new int[n+1];
        for (int i = 1; i <= n; i++) {
            value[i] = sc.nextInt();
        }
        int current = k;
        while (true) {
            if(current > n){
                System.out.println("out of bounds");
                break ;
            }
            int val = value [current] ;
            System.out.println(current+ " " + val);
            current += val ;
        }
    }
}
