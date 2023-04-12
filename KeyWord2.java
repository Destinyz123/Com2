
import java.util.Scanner;

public class KeyWord2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE ;
        String[] keep = new String[n];
        int [] stack = new int [n] ;
        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            boolean check = true;
            for (int j = 0; j < count; j++) {
                if (word.equals(keep[j])) {
                    check = false;
                    stack [j] ++ ;
                }
            }
            if (check == true) {
                keep[count] = word;
                count++;
            }
        }
        for(int i = 0 ; i < count ; i ++ ){
            if(stack [i] >= max){
                max = stack[i] ;
            }
        }
        for(int i = 0 ; i < count ; i ++ ){
            System.out.print(keep[i]+" ") ;
        }
        System.out.println("");
        System.out.print((max+1)+" ");
        for(int i = 0 ; i < count ; i ++ ){
            if(stack[i] == max){
                System.out.print(keep[i]+" ");
            }
        }
    }

}
