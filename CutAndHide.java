
import java.util.Scanner;


public class CutAndHide {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String str = sc.next() ;
        String ch = sc.next() ;
        String stack_fpart = str.substring(str.indexOf(ch)) ;
        String full_stack = stack_fpart.substring(stack_fpart.indexOf(ch),stack_fpart.lastIndexOf(ch)) ;
//        System.out.println(stack_fpart);
        String [] keep = full_stack.split(ch) ;
        System.out.print(ch);
        for(int i = 0 ; i < keep.length ; i ++ ){
            System.out.print(keep[i]);
        }
        System.out.println(ch);
    }
    
}
