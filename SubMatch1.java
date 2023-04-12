
import java.util.Scanner;

public class SubMatch1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String want = sc.nextLine();
        String k = want.substring(0, 3) ;
        String n = want.substring(1, 4) ;
        String x = want.substring(2,5) ;
        //System.out.println(k+" "+n+" "+x);
        
        if(str.indexOf(k,0) == -1 ){
            System.out.println("No");
        }
        else{
            System.out.println(str.indexOf(k,0)+1) ;
        }
        if(str.indexOf(n,0) == -1){
            System.out.println("No");
        }
        else{
            System.out.println(str.indexOf(n,0)+1);
        }
        if(str.indexOf(x,0) == -1 ){
            System.out.println("No");
        }
        else{
            System.out.println(str.indexOf(x,0)+1);
        }
    }
}
