
import java.util.Scanner;

class Percint{
    String region ;
    String [] group ;
    int [] countp ;
    
    Percint(String region , String [] group){
        this.region = region ;
        this.group = group ;
        countp = new int [group.length] ;
    }
    public void count(int point){
        if(point > 0 && point <= group.length){
            countp[point-1] ++ ;
            System.out.println(group[point-1]+" "+countp[point-1]);
        }
        else{
            System.out.println("invalid number");
        }
    }
    public void printinfo(){
        for(int i = 0 ; i < group.length ; i ++ ){
            System.out.println((i+1)+" "+group[i]+" "+countp[i]);
        }
    }
    public void printmax(){
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < group.length ; i ++ ){
            if(countp[i] > max){
                max = countp[i] ;
            }
        }
        for(int i = 0 ; i < group.length ; i ++){
            if(countp[i] == max){
                System.out.println((i+1)+" "+group[i]+" "+countp[i]);
            }
        }
    }
}
public class KorKorTor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.next() ;
        int n = sc.nextInt() ;
        String [] gp = new String [n] ;
        sc.nextLine() ;
        for(int i = 0 ; i < n ; i ++ ){
            gp [i] = sc.next() ;
        }
        Percint pt = new Percint(name , gp) ;
        int k = sc.nextInt() ;
        for(int i = 0 ; i < k ; i ++){
            int cmd = sc.nextInt() ;
            if(cmd == 1){
                int h = sc.nextInt() ;
                pt.count(h);
            }
            else if(cmd == 2){
                pt.printinfo();
            }
            else{
                pt.printmax();
            }
        }
    }
    
}
