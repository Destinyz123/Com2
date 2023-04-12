
import java.util.Scanner;


public class indexOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String str = sc.nextLine() ;
        String want = sc.nextLine() ;
        if(str.indexOf(want) == -1){
            System.out.println("string not found");
        }
        else{
            System.out.println(str.indexOf(want)+1);
        }
        
    }
    
}
