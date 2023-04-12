
import java.util.Scanner;

public class ArrayJump1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n+1];
        for (int i = 1; i <= n; i++) {
            value[i] = sc.nextInt();
        }
        int jump = 0;
        int current = 1;
        while (true) {
            if(jump == 5){
                break ;
            }
            if(current > n){
                System.out.println("out of bounds");
                break ;
            }
            int val = value [current] ;
            System.out.println(current+ " " + val);
            current += val ;
            jump ++ ;
        }
    }
}
