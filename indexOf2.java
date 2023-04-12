
import java.util.Scanner;

public class indexOf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String want = sc.nextLine();
        if (str.indexOf(want) == -1) {
            System.out.println("string not found");
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(want, i) != str.indexOf(want, i + 1)) {
                    System.out.print((str.indexOf(want, i)+1) + " ");
                }
            }
        }
    }

}
