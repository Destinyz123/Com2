
import java.util.Scanner;

class Route3 {

    String[] station;
    int[] distance;

    public Route3(String[] station, int[] distance) {
        this.station = station;
        this.distance = distance;
    }

    public void getStopInfo(int result, int numb, int round, int k) {
        if(numb == k){
            System.out.println("invalid number");
        }
        else if (numb >= 1 && numb <= round && k >= numb && k <= round) {
            System.out.println(station[numb] + " " + station[k] + " " + result);
        }
        
        else {
            System.out.println("invalid number");
        }
    }
}

public class BasRoute3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String[] names = new String[n + 1];
        int[] distance = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            names[i] = sc.next();
            distance[i] = sc.nextInt();
        }
        Route3 use = new Route3(names, distance);
        final int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int m = sc.nextInt();
            int z = sc.nextInt();
            int sum = 0;
            if (m < z && m!=z) {
                if (m >= 1 && z <= n) {
                    for (int j = m + 1; j <= z; j++) {
                        sum += distance[j];
                    }
                }
            }
            use.getStopInfo(sum, m, n, z);
        }

    }

}
