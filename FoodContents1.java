
import java.util.Scanner;

class Food {
    String foodname ;
    String ingre ;
    int weight ;
    int cal ;
    
    public Food(String foodname, String ingre, int weight , int cal) {
        this.foodname = foodname ;
        this.ingre = ingre ;
        this.weight = weight ;
        this.cal = cal*weight ;
    }
    public void addContent(String fragm , int weig , int ca){
        weight += weig ;
        cal += ca * weig ;
        ingre += " "+fragm ;
    }
    public void printinfo(){
        System.out.println(foodname);
        System.out.println(weight+" "+cal);
        System.out.print(ingre+" ");
        
    }
}

public class FoodContents1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next() ;
        String compo = sc.next() ;
        int wei = sc.nextInt() ;
        int calo = sc.nextInt() ;
        Food cont = new Food (name , compo , wei , calo) ;
        int command = sc.nextInt() ;
        while(command != 0 ){
            if(command == 1){
                cont.printinfo();
            }
            else if(command == 2){
                String content = sc.next() ;
                int w = sc.nextInt() ;
                int calorie = sc.nextInt() ;
                cont.addContent(content, w , calorie);
            }
            command = sc.nextInt() ;
        }
    }

}
