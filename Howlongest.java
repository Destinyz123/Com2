
import java.util.Scanner;

public class Howlongest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int current = 0;
        for(int i = 1 ; i <= n ; i ++ ){
            if(arr[i] == 1){
                current ++ ;
                if(max < current){
                    max = current ;
                }
            }
            else{
                    current = 0 ;
                }
        }
        System.out.println(max);
        for(int i = 1 ; i <= n ; i ++ ){
            if(arr[i] == 1){
                current ++ ;
                if(current == max){
                    System.out.print((i - max + 1)+" ");
                }
            }
            else{
                current = 0 ;
            }
        }
    }

}
