
import java.util.Scanner;

public class CharAt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int want = sc.nextInt();
        if (want >= 1 && want - 1 < str.length()) {
            System.out.println(str.charAt(want - 1));
        } else {
            System.out.println("invalid position");
        }
    }

}
