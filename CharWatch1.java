
import java.util.Scanner;

public class CharWatch1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String interest1 = sc.next();
        String interest2 = sc.next();
        String interest3 = sc.next();
        char check1 = interest1.charAt(0) ;
        char check2 = interest2.charAt(0) ;
        char check3 = interest3.charAt(0) ;
        String str = sc.next();
        int round = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int out = 0 ;
        System.out.println(str.length());
        for (int i = 0; i < round; i++) {
            int number = sc.nextInt();
            if (number > 0 && number <= str.length()) {
                char get = str.charAt(number-1) ;
                if (get == check1) {
                    count1 ++ ;
                } else if (get == check2) {
                    count2 ++ ;
                } else if (get == check3) {
                    count3 ++ ;
                }
            }
            else {
                out ++ ;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(out);
    }

}
