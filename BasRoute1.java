
import java.util.Scanner;

class Route {
        String [] station ;
        int [] distance ;
        
        public Route(String [] station , int [] distance){
            this.station = station ;
            this.distance = distance ;
        }
        public void getStopInfo(int numb , int k){
            if(numb >=1 && numb <= k){
                System.out.println(station[numb]+" "+distance[numb]);
            }
            else{
                System.out.println("invalid number");
            }
        }         
}

public class BasRoute1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt() ;
        String [] names =  new String [n+1] ;
        int [] distance = new int [n+1] ;
        for(int i = 1 ; i < n+1 ; i ++ ){
            names [i] = sc.next() ;
            distance [i] = sc.nextInt() ;
        }
        Route use = new Route (names , distance) ;
        final int k = sc.nextInt() ;
        for(int i = 0 ; i < k ; i ++ ){
            int m = sc.nextInt() ;
            use.getStopInfo(m, n);
        }
        
    }

}
