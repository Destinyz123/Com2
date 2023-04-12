
import java.util.Scanner;

class Theater{
    boolean threed ;
    boolean luxury ;
    int sit ;
    int basePrice = 0 ;
    String title = "";
    int [] seats ;
    Theater(boolean threed , boolean luxury , int sit){
        this.threed = threed ;
        this.luxury = luxury ;
        this.sit = sit ;
        seats = new int [sit+1] ;
    }
    public void setTitle(String movie){
        if(movie == null || movie.length() == 0){
            System.out.println("invalid title");
        }
        else{
            title = movie ;
        }
    }
    public void setBasePrice(int ticket_price){
        if(ticket_price <= 0){
            System.out.println("invalid price");
        }
        else{
            basePrice = ticket_price ;
        }
    }
    public void printinfo(){
        if(threed == true){
            System.out.println("3D");
        }
        else{
            System.out.println("No 3D");
        }
        if(luxury == true){
            System.out.println("Luxury");
        }
        else{
            System.out.println("Standard");
        }
        System.out.println(seats.length-1);
        if(title.length() == 0){
            System.out.println("title is not set");
        }
        else{
            System.out.println(title);
        }
        if(basePrice == 0){
            System.out.println("price is not set");
        }
        else{
            System.out.println(basePrice);
        }
    }
    public int reserveOne(int seatNumber){
        if(seatNumber<= 0 || seatNumber >= seats.length){
            System.out.println("sorry");
            return -1 ;
        }
        else{
            if(seats[seatNumber] == 0){
                seats[seatNumber] ++ ;
                return basePrice ;
            }
            else{
                System.out.println("sorry");
                return -1 ;
            }
        }
    }
    public int reserveMultiple(int numSeats , int seatNumber){
        if(seatNumber <= 0 || seatNumber > seats.length){
            System.out.println("sorry");
            return -1 ;
        }
        else if(numSeats + seatNumber > seats.length){
            System.out.println("sorry");
            return -1 ;
        }
        else{
            int count = 0 ;
            for(int i = seatNumber ; i < seatNumber + numSeats ; i ++ ){
                if(seats[i] == 1){
                    System.out.println("sorry");
                    count ++ ;
                    break ;
                }
            }
            if(count == 1){
                return -1 ;
            }
            else{
                for(int i = seatNumber ; i < seatNumber + numSeats ; i ++ ){
                    seats[i] ++ ;
                }
                return numSeats * basePrice ;
            }
        }
        
    }
}
public class Theater2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int threed1 = sc.nextInt() ;
        int lux1 = sc.nextInt() ;
        int numseat = sc.nextInt() ;
        boolean threed = false ;
        boolean lux = false ;
        if(threed1 == 1){
            threed = true ;
        }
        if(lux1 == 1){
            lux = true ;
        }
        Theater tr = new Theater(threed , lux , numseat) ;
        sc.nextLine() ;
        String title = sc.nextLine() ;
        tr.setTitle(title);
        int price = sc.nextInt() ;
        tr.setBasePrice(price);
        int n = sc.nextInt() ;
        for(int i = 0 ; i < n ; i ++ ){
            int nos = sc.nextInt() ;
            int sn = sc.nextInt() ;
            int totalPrice ;
            if(nos == 1){
                totalPrice = tr.reserveOne(sn) ;
            }
            else{
                totalPrice = tr.reserveMultiple(nos, sn) ;
            }
            if(totalPrice > 0){
                System.out.println(totalPrice);
            }
        }
        tr.printinfo(); 
    }
    
}
