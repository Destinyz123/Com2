
import java.util.Scanner;

public class DivideString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] big = new char[str.length()];
        char[] small = new char[str.length()];
        char[] special = new char[str.length()];
        int count_b = 0;
        int count_s = 0;
        int count_sp = 0;
        for (int i = 0; i < str.length(); i++) {
            int compare = str.charAt(i);
            if (compare >= 65 && compare <= 90) {
                big[count_b] = str.charAt(i);
                count_b++;
            } else if (compare >= 97 && compare <= 122) {
                small[count_s] = str.charAt(i);
                count_s++;
            } else {
                special[count_sp] = str.charAt(i);
                count_sp++;
            }
        }
        for (int i = 0; i < count_s; i++) {
            System.out.print(small[i]);
        }
        System.out.println("");
        for (int i = 0; i < count_b; i++) {
            System.out.print(big[i]);
        }
        System.out.println("");
        for (int i = 0; i < count_sp; i++) {
            System.out.print(special[i]);
        }
    }

}
