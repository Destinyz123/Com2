
import java.util.Scanner;
public class Lease1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int [] time = new int [numb];
        for(int i=0;i<numb;i++){
            time[i] =  sc.nextInt();
        }
        int year = sc.nextInt();
        for(int i=0;i<numb;i++){
            System.out.print((year-1)+time[i]+" ");
        }
    }
    
}
