
import java.util.Scanner;

public class CharWatch2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String interest1 = sc.next();
        String interest2 = sc.next();
        String interest3 = sc.next();
        char check1 = interest1.charAt(0);
        char check2 = interest2.charAt(0);
        char check3 = interest3.charAt(0);
        int round = sc.nextInt();
        String[] keep = new String[round];
        for (int i = 0; i < round; i++) {
            keep[i] = sc.next();
        }
        int numb = sc.nextInt();
        int[] get = new int[numb];
        for (int i = 0; i < numb; i++) {
            get[i] = sc.nextInt();
        }
        int count1 = 0 ;
        int count2 = 0 ;
        int count3 = 0 ;
        for (int i = 0; i < round; i++) {
            for (int j = 0; j < numb; j++) {
                if (get[j] > 0 && get[j] <= keep[i].length()) {
                    char change = keep[i].charAt(get[j]-1);
                    if (check1 == change) {
                        count1 ++ ;
                    }
                    else if(check2 == change){
                        count2 ++ ;
                    }
                    else if(check3 == change){
                        count3 ++ ;
                    }
                }
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }

}
