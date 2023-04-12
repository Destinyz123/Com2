
import java.util.Scanner;

class TumBol {

    String name;
    int latitude;
    int longtitude;
    int people;

    public TumBol(String name, int latitude, int longtitude, int people) {
        this.name = name;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.people = people;
    }

    public int allocateBudget(int[] hum) {
        int sum = 0;
        for (int i = 0; i < hum.length; i++) {
            if (sum + hum[i] < people * 5000) {
                sum += hum[i];
                System.out.print(i + 1 + " ");
            }
        }
        if (sum == 0) {
            System.out.print("none");
        }
        System.out.println("");
        return sum;
    }
}

public class TumBol1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TumBol[] tb = new TumBol[n];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int lati = sc.nextInt();
            int longti = sc.nextInt();
            int innocent = sc.nextInt();
            tb[i] = new TumBol(str, lati, longti, innocent);
        }
        int obj = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int[] funds = new int[k];
            for (int j = 0; j < k; j++) {
                funds[j] = sc.nextInt();
            }
            obj = tb[i].allocateBudget(funds);
            sum += obj ;
        }
        System.out.println(sum);
    }

}
