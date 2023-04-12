import java.util.Scanner;
public class Crypto {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] crypto = new int [n] ;
        for(int i = 0 ; i < n ; i++){
            crypto [i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int key = sc.nextInt();
        boolean v1 = (crypto [pos] + key <= 51743);
        boolean v2 = (crypto [pos+1] - key > 7832);
        boolean v3 = (crypto [pos+2] - key < 2394);
        boolean v4 = (crypto [pos+3] + key > 9213);
        if(v1 || v2){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        if(v3 || v4){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        if((v1 || v2) && (v3 || v4)){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
    
}
