
import java.util.Scanner;

public class Lease2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int[] time = new int[numb+1];
        int[] stack = new int[numb+1];
        for (int i = 1; i <= numb; i++) {
            time[i] = sc.nextInt();
        }
        int year = sc.nextInt();
        int quan = sc.nextInt();
        int [] PD = new int [quan];
        for (int i = 1; i <= numb; i++) {
            stack[i] = (year - 1) + time[i];
        }
        for (int i = 0; i < quan; i++) {
           PD [i] = sc.nextInt();
        }
        for(int i = 0 ; i < quan ; i++){
            boolean check = true ;
            for(int j = 1 ; j <= numb ; j++){             
                if(PD [i] - stack [j] > 0){
                    check = false ;
                    System.out.print(j+" ");
                }
            }
            if(check){
                System.out.print("full");
            }
            System.out.println("");
        }
    }
}
