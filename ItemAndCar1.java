
import java.util.Scanner;
class Items{
    String name ;
    String id ;
    int price ;
    int shipping ;
    int volume ;
    int quan ;
    boolean valid = true;
    
    Items(String name , String id , int price , int shipping , int volume , int quan){
        this.name = name ;
        this.id = id ;
        this.price = price ;
        this.shipping = shipping ;
        this.volume = volume ;
        this.quan = quan ;
        basiccheck(name , id , price , shipping , volume);
    }
    boolean basiccheck(String item , String iden , int cost , int ship , int vol){
        if(item.length() < 3 || iden.length() < 3 || cost < 0 || ship < 0 || vol < 0){
            valid = false ;
        }
        else{
            valid = true ;
        }
        return valid ;
    }
    boolean cutStock(int min){
        if(quan - min >= 0){
            quan -= min ;
            return true ;
        }
        else{
            return false ;
        }
    }
    void printInfo(){
        System.out.println(name+" "+id+" "+price);
        System.out.println(shipping+" "+volume+" "+quan+" "+valid);
    }
}

public class ItemAndCar1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String name = sc.next() ;
        String id = sc.next() ;
        int price = sc.nextInt() ;
        int shipping = sc.nextInt() ;
        int volume = sc.nextInt() ;
        int quan = sc.nextInt() ;
        Items it = new Items(name , id , price , shipping , volume , quan) ;
        it.printInfo();
        int n = sc.nextInt() ;
        for(int i = 0 ; i < n ; i ++ ){
            int q = sc.nextInt() ;
            System.out.println(it.cutStock(q));
            it.printInfo();
        }
    }
    
}
