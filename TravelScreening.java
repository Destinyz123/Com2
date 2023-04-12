
import java.util.Scanner;


class Traveler {

    String passid;
    String nation;
    String date;
    double temp;

    public Traveler(String passid, String nation, String date, int temp) {
        this.passid = passid ;
        this.nation = nation ;
        this.date = date ;
        this.temp = temp ;
    }
    public void printinfo(){
        if(temp >= 34 && temp <= 37.5){
            System.out.println(passid+" SELF-QUARANTINE");
        }
        else{
            System.out.println(passid+" STATE-QUARANTINE");
        }
    }
}

public class TravelScreening {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        for(int i = 0 ; i < n ; i ++ ){
            String passport = sc.next() ;
            String nationnal = sc.next() ;
            String day = sc.next() ;
            double temper = sc.nextDouble() ;
        }
    }

}
