
import java.util.Scanner;

public class LongestCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0 ;
        for (;;) {
            String str = sc.nextLine();
            if(str.length() == 0){
                break ;
            }
            if(max < str.length()){
                count = 0 ;
            }
            if (str.length() >= max) {
                max = str.length();
                count ++ ;
            }
        }
        System.out.println(max);
        System.out.println(count);
        }
    }


