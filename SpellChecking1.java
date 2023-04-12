
import java.util.Scanner;

public class SpellChecking1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] spell = new String[n];
        for (int i = 0; i < n; i++) {
            spell[i] = sc.next();
        }
        for (int i = 0; i < 10; i++) {
            String word = sc.next();
            boolean check = false;
            for (int j = 0; j < n ; j++) {
                String word2 = spell[j];
                boolean eq = word.equals(word2) ;
                if (eq) {
                    check = true ;
                }
            }
            if(check == true){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
    }

}
