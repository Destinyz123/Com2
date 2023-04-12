
import java.util.Scanner;

public class StringCut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String want = sc.nextLine();
        String[] parts = str.split(want);
        int count = 0;
        if (str.indexOf(want) == -1) {
            System.out.println("no target character found");
        } else {
            for (int i = 0; i < parts.length; i++) {
                if (parts[i] != "") {
                    System.out.println(parts[i]);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("no output");
            }
        }
    }
}
