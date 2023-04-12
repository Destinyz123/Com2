
import java.util.Scanner;

class ZooTicketA{
    boolean check ;
    boolean used = false ;
    boolean ride = false ;
    
    ZooTicketA(boolean check){
        this.check = check ;
        
    }
    boolean enterZoo(int height){
        if(check == false){
            if(used == false){
                used = true ;
                return true ;
            }
            else{
                return false ;
            }
        }
        else{
            if(height <= 120){
                if(used == false){
                    used = true ;
                    return true ;
                }
                else{
                    return false ;
                }
            }
            else{
                return false ;
            }
        }
    }
    boolean useRide(){
        if(ride == false){
            if(used == true){
                ride = true ;
                return true ;
            }
            else{
                return false ;
            }
        }
        else{
            return false ;
        }
    }
    
}
public class ZooTicketAgain1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n  = sc.nextInt() ;
        ZooTicketA [] tk = new ZooTicketA [n+1] ;
        for(int i = 1 ; i <= n ; i ++ ){
            int type = sc.nextInt() ;
            if(type == 1){
                tk [i] = new ZooTicketA (false) ;
            }
            else{
                tk [i] = new ZooTicketA (true) ;
            }
        }
            int k = sc.nextInt() ;
            for(int i = 0 ; i < k ; i ++){
                int id = sc.nextInt() ;
                int type = sc.nextInt() ;
                if(type == 1){
                    int height = sc.nextInt() ;
                    boolean check = tk[id].enterZoo(height);
                    System.out.println(check);
                }
                else if(type == 2){
                    boolean ride = tk[id].useRide() ;
                    System.out.println(ride);
                }
                
            }
        
    }
    
}
