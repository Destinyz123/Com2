
import java.util.Scanner;

public class CharInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char want1 = sc.next().charAt(0);
        char want2 = sc.next().charAt(0);
        char inter1 = sc.next().charAt(0);
        char inter2 = sc.next().charAt(0);
        char need1 = sc.next().charAt(0);
        char need2 = sc.next().charAt(0);
        int w1 = want1;
        int w2 = want2;
        int i1 = inter1;
        int i2 = inter2;
        int n1 = need1;
        int n2 = need2;
        if (w2 < w1) {
            int f = w1;
            w1 = w2;
            w2 = f;
        }
        if (i2 < i1) {
            int f2 = i1;
            i1 = i2;
            i2 = f2;
        }
        if (n2 < n1) {
            int f3 = n1;
            n1 = n2;
            n2 = f3;
        }
        for (int i = 0; i < 3; i++) {
            char check = sc.next().charAt(0);
            int know = check;
            int count = 0 ;
            if (know >= w1 && know <= w2) {
                System.out.print("1 ");
                count ++ ;
            }
            if (know >= i1 && know <= i2) {
                System.out.print("2 ");
                count ++ ;
            }
            if (know >= n1 && know <= n2) {
                System.out.print("3 ");
                count ++ ;
            } if(count == 0){
                System.out.print("0");
            }
            System.out.println("");
        }
    }

}
