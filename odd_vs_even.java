import java.util.Scanner;
public class odd_vs_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0 ;
        int odd = 0 ;
        for(int i=0;i<8;i++){
            int a = sc.nextInt();
            if(a%2==0){
                even += a;
            }
            else if(a%2!=0){
                odd += a;
            }
        }
        if(odd>even){
            System.out.println("odd");
        }
        else if(even>odd){
            System.out.println("even");
        }
        else if(even==odd){
            System.out.println("equal");
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
