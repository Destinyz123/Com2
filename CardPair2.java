
import java.util.Scanner;

public class CardPair2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        for (int i = 0; i < 5; i++) {
            str1 = sc.next();
            str2 = sc.next();
            char f_card = str1.charAt(0);
            char s_card = str1.charAt(1);
            char t_card = str2.charAt(0);
            char fi_card = str2.charAt(1);
            int value_f = f_card;
            int value_s = s_card;
            int value_t = t_card;
            int value_fi = fi_card;
            int sum1 = 0;
            int sum2 = 0;
            if (value_f == value_s || value_t == value_fi) {
                if (value_f == value_s && value_t != value_fi) {
                    System.out.print("W");
                } else if (value_f != value_s && value_t == value_fi) {
                    System.out.print("L");
                } else if (value_f == value_s && value_t == value_fi && value_f < value_t) {
                    System.out.print("W");
                } else if (value_f == value_s && value_t == value_fi && value_f > value_t) {
                    System.out.print("L");
                } else if (value_f == value_s && value_t == value_fi && value_f == value_t) {
                    System.out.print("D");
                }
            } else {
                if (value_f < value_s) {
                    sum1 = value_f;
                } else if (value_f >= value_s) {
                    sum1 = value_s;
                }
                if (value_t < value_fi) {
                    sum2 = value_t;
                } else if (value_t >= value_fi) {
                    sum2 = value_fi;
                }
                if (sum1 < sum2) {
                    System.out.print("W");
                } else if (sum1 == sum2) {
                    System.out.print("D");
                } else if (sum1 > sum2) {
                    System.out.print("L");
                }
            }
        }
    }

}
