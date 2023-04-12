
import java.util.Scanner;


public class UpSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String str = sc.nextLine() ;
        for(int i = 0 ; i < str.length() ; i ++ ){
            if(i == str.length()-1){
                System.out.println(str.charAt(i));
            }
            else if((int)str.charAt(i) < (int)str.charAt(i+1)){
                System.out.print(str.charAt(i));
            }
            else{
                System.out.println(str.charAt(i));
            }
        }
    }
    
}
