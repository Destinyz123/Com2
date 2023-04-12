
import java.util.Scanner;

public class AABBCC1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        int keep = str.charAt(0);
        int max = 1;
        for (int i = 1; i < str.length(); i++) {
            int check = str.charAt(i);

            if (check - 1 == keep || check == keep) {
                count++;
                keep = check;
                if (count > max) {
                    max = count;
                }
            } else {

                keep = check;
                count = 1;
            }
        }
        System.out.println(max);
    }

}
