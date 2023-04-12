
import java.util.Scanner;

public class LongestString4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String keep = "" ;
        for (;;) {
            String str = sc.nextLine();
            if(str.length() == 0){
                break ;
            }
            if (str.length() >= max) {
                max = str.length();
                keep = str ;
            }
        }
        System.out.println(keep);
        }
    }


