
import java.util.Scanner;

class Item{
    boolean check ;
    double weight ;
    Item(boolean check , double weight){
        this.check = check ;
        this.weight = weight ;
    }
    Item(double weight){
        this.weight = weight ;
    }
    double saleprice(double pg){
        double result = 0 ;
        if(check == true){
            result = (pg * weight) + (1000 * weight) ;
        }
        else if(check == false){
            result = pg * weight ;
        }
        return result ;
    }
    double buyprice(double pcg){
        double sum = 0 ;
        if(check == true){
            sum = (pcg * weight)*0.98 ;
        }
        else if(check == false){
            sum = (pcg - 100) * weight ;
        }
        return sum ;
    }
    void showdetail(double price){
        if(check == false){
            System.out.print("bar "+weight+" baht");
        }
        else if( check == true){
            System.out.print("ornament "+weight+" baht");
        }
    }
}
public class SUGoldShop1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        double pricegold = sc.nextDouble() ;
        Item [] im = new Item [n] ;
        double sumb = 0;
        double sums = 0;
        double counts = 0;
        double countb = 0;
        for(int i = 0 ; i < n ; i ++ ){
            String cmd = sc.next() ;
            String typegold = sc.next() ;
            double weight = sc.nextDouble() ;
            if(typegold.equalsIgnoreCase("t")){
                im [i] = new Item (true , weight) ;
            }
            else{
                im [i] = new Item (false , weight) ;
            }
            
            
            if(cmd.equalsIgnoreCase("s")){
                counts += weight ;
                sums +=im[i].saleprice(pricegold);
            }
            else if(cmd.equalsIgnoreCase("b")){
                countb += weight ;
                sumb += im[i].buyprice(pricegold);
            }
        }
        System.out.println(counts+" "+sums);
        System.out.println(countb+" "+sumb);
    }
    
}
