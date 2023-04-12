
import java.util.Scanner;

class FoodShop{
    String name ;
    int nFoods = 0 ;
    String [] menu = new String [5] ;
    FoodShop(String name){
        this.name = name ;
    }
    boolean addFood(String name){
        if(nFoods < 5){
            menu[nFoods] = name ;
            nFoods ++ ;
            return true ;
        }
        else{
            return false ;
        }
    }
    void printMenu(){
        System.out.print(name+" ");
        for(int i = 0 ; i < nFoods ; i ++ ){
            System.out.print(menu[i]+" ");
        }
    }
}
public class FoodTiger1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        final int n = sc.nextInt() ;
        FoodShop [] fs = new FoodShop [n+1] ;
        for(int i = 1 ; i <= n ; i ++ ){
            String name = sc.next() ;
            fs [i] = new FoodShop(name) ;
        }
        int k = sc.nextInt() ;
        for(int i = 0 ; i < k ; i ++){
            int s = sc.nextInt() ;
            String name = sc.next();
            boolean ret = fs[s].addFood(name) ;
            if(ret == false){
                System.out.println("-1 "+ret);
            }
            else{
                System.out.println(fs[s].nFoods+" "+ret);
            }
        }
        for(int i = 1 ; i <= n ; i ++){
            fs[i].printMenu();
            System.out.println("");
        }
    }
    
}
