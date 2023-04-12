
import java.util.Scanner;

public class StringExtremum2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String free = sc.nextLine() ;
        String inter1 = sc.nextLine();
        String inter2 = sc.nextLine();
        String str = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (n == 1) {
            for (;;) {
                String word = sc.nextLine();
                if (word.length() == 0) {
                    break;
                }
                if (word.indexOf(inter1) != -1 || word.indexOf(inter2) != -1) {
                    if (word.length() >= max) {
                        max = word.length();
                        str = word;
                    }
                }
            }
            System.out.println(max);
            System.out.println(str);
        } else {
            for (;;) {
                String word = sc.nextLine();
                if (word.length() == 0) {
                    break;
                }
                if (word.indexOf(inter1) != -1 || word.indexOf(inter2) != -1) {
                    if (word.length() <= min) {
                        min = word.length();
                        str = word;
                    }
                }
            }
            System.out.println(min);
            System.out.println(str);
        }
    }

}
