
import java.util.ArrayList;
import java.util.Scanner;

class Runner {

    String name;
    int bib;
    static int count = 0;
    int id;

    Runner(String name, int bib) {
        this.name = name;
        this.bib = bib;
        count++;
        id = count;
    }

    void printInfo() {
        String str;

        if (bib == 1) {
            if (count < 10) {
                str = String.format("%03d", id);
                System.out.print("A" + str + " ");

            } else {
                str = String.format("%03d", id);
                System.out.print("A" + str + " ");

            }
        } else if (bib == 2) {
            if (count < 10) {
                str = String.format("%03d", id);
                System.out.print("B" + str + " ");

            } else {
                str = String.format("%03d", id);
                System.out.print("B" + str + " ");

            }

        } else if (bib == 3) {
            if (count < 10) {
                str = String.format("%03d", id);
                System.out.print("C" + str + " ");

            } else {
                str = String.format("%03d", id);
                System.out.print("C" + str + " ");

            }

        } else if (bib == 4) {
            if (count < 10) {
                str = String.format("%03d", id);
                System.out.print("D" + str + " ");

            } else {
                str = String.format("%03d", id);
                System.out.print("D" + str + " ");

            }
        } else {
            System.out.println("INVALID");

        }
    }
}

public class Marathon1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Runner> rn = new ArrayList<>();
        int[] cnt = new int[5];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int type = sc.nextInt();
            if (type >= 1 && type <= 4) {
                Runner r = new Runner(name, type);
                rn.add(r);
                cnt[type]++;
            }
        }
        for (int i = 1; i <= 4; i++) {
            System.out.println(cnt[i]);
            if (cnt[i] == 0) {
                System.out.print("-");
            } else {
                for (int j = 0; j < rn.size(); j++) {
                    if (rn.get(j).bib == i) {
                        rn.get(j).printInfo();
                    }
                }
            }
            System.out.println("");
        }
    }

}
