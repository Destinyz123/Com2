
import java.util.Scanner;

class Route1 {

    String[] station;
    int[] distance;

    public Route1(String[] station, int[] distance) {
        this.station = station;
        this.distance = distance;
    }

    public void getStopInfo1(int numb, int k) {
            System.out.println(station[1] + " " + station[k] + " " +numb);       
    }
}

public class BasRoute2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String[] names = new String[n + 1];
        int[] distance = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            names[i] = sc.next();
            distance[i] = sc.nextInt();
        }
        Route1 use1 = new Route1(names, distance);
        int sum = 0 ;
        for (int i = 0 ; i < n+1 ; i ++ ) {
            sum += distance[i] ;
        }
        use1.getStopInfo1(sum, n);
    }

}
