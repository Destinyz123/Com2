
import java.util.Scanner;

public class OutBound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numb = new int[n];
        for (int i = 0; i < n; i++) {
            numb[i] = sc.nextInt();
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0 ;
        for (int i = 0; i < n; i++) {
            if (numb[i] < start || numb[i] > end) {
                System.out.print(numb[i] + " ");
                count ++ ;
            }
        }
        if(count == 0){
            System.out.println("no data");
        }
    }
}
