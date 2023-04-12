
import java.util.Scanner;
class Car {
    String id_car ;
    int price ;
    int power ;
    
    Car(String id_car , int price , int power){
        this.id_car = id_car ;
        this.price = price ;
        this.power = power ;
        
    }
    public static boolean check(String name , int price , int power){
        if(name.length() > 0 && price > 0 && power > 0){
            return true ;
        }
        else{
            return false ;
        }
    }
}
class Factory{
    int count ;
    boolean [] make ;
    int allpower ;
    Factory(int count, boolean [] make , int allpower){
        this.count = count ;
        make = new boolean [count+1] ;
        for(int i = 1 ; i <= count ; i ++ ){
            this.make [i] = make[i] ;
        }
        
        this.allpower = allpower ;       
    }
}

public class AliCarCar1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        Car [] cars = new Car [n+1] ;
        
        int count = 0 ;
        for(int i = 0 ; i < n ; i ++ ){
            String name = sc.next() ;
            int price = sc.nextInt() ;
            int labor = sc.nextInt() ;
            
            if(Car.check(name , price , labor) == true){
                cars [count] = new Car (name , price , labor) ;               
                count ++ ;
            }
        }
        Factory [] ftr = new Factory [6] ;
        boolean [] ch = new boolean [n+1] ; 
        for(int i = 1 ; i <= 5 ; i ++ ){
            int pow = sc.nextInt() ;
            for(int j = 1 ; j <= n ; j ++){
                int k = sc.nextInt() ;
                if(k == 1){
                    ch [j] = true ;
                }
                else{
                    ch [j] = false ;
                }
            }
            ftr [i] = new Factory (count , ch , pow) ;
        }
        int z = sc.nextInt() ;
        for(int i = 0 ; i < z ; i ++ ){
            int model = sc.nextInt() ;
            if(model > cars.length){
                System.out.println("invalid model");
            }
            else if (ftr[model].allpower >= cars[i].power){  
                
                System.out.println("okay");
                for(int j = 0 ; j < n ; j ++ ){
                    Factory th = ftr[j] ;
                    Car c = cars[model] ;     
                    if(ftr[model].make[j] == true){
                        th.allpower -= c.power ;
                        System.out.println(j+1);
                        break ;
                    }
                }
            }
            else if(ftr[model].allpower < cars[i].power){
                System.out.println("unable to build");
            }
        }
    }
    
}
