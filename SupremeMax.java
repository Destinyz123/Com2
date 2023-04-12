
import java.util.Scanner;

public class SupremeMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] start = new int[n];
        int[] end = new int[n];
        int[] max = new int[n];
        int count = 0;
        int supMax = Integer.MIN_VALUE;
        int intervalMax = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                if (intervalMax == 0) {
                    start[count] = i;
                }
            }
            if (a[i] > intervalMax) {
                intervalMax = a[i];
            }
            if (intervalMax > supMax) {
                supMax = intervalMax;
            }
            if (a[i] == 0 && intervalMax != 0) {
                max[count] = intervalMax;
                System.out.print(intervalMax + " ");
                end[count] = i - 1;
                intervalMax = 0;
                count++;
            }
        }
        System.out.println("");
        System.out.println(supMax);
        for (int i = 0; i < count; i++) {
            if (max[i] == supMax) {
                for (int j = start[i]; j <= end[i]; j++) {
                    System.out.print(a[j] + " ");
                }
                break;
            }

        }

    }

}
