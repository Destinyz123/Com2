
import java.util.Scanner;

public class StringExtremum1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String free = sc.nextLine() ;
        String str = "" ;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if (n == 1) {
            for (;;) {
                String word = sc.nextLine();
                if (word.length() == 0) {
                    break;
                }
                if (word.length() >= max) {
                    str = word;
                    max = word.length();
                }
            }
            System.out.println(max);
            System.out.println(str);
        }
        else{
            for (;;) {
                String word = sc.nextLine();
                if (word.length() == 0) {
                    break;
                }
                if (word.length() <= min) {
                    str = word;
                    min = word.length();
                }
            }
            System.out.println(min);
            System.out.println(str);
        }
    }

}
