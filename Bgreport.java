
import java.util.Scanner;

public class Bgreport {

    static void reportBg(String name, int byear, int syear) {
        if (name.length() >= 2) {
            System.out.println("Name: " + name);
            if (byear >= 1900 && byear <=2022) {
                System.out.println("Birth year: " + byear);
                if (syear - byear >= 18 && syear <= 2022) {
                    System.out.println("Start year: " + syear);
                } else {
                    System.out.println("Start year: INVALID");
                }
            } else {
                System.out.println("Birth year: INVALID");
                System.out.println("Start year: INVALID");
            }
        } else if (name.length() < 2) {
            System.out.println("Name: INVALID");
            if (byear >= 1900 && byear <=2022) {
                System.out.println("Birth year: " + byear);
                if (syear - byear >= 18 && syear <= 2022) {
                    System.out.println("Start year: " + syear);
                } else {
                    System.out.println("Start year: INVALID");
                }
            } else {
                System.out.println("Birth year: INVALID");
                System.out.println("Start year: INVALID");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int birth = sc.nextInt();
        int start = sc.nextInt();
        reportBg(n, birth, start);
    }

}
