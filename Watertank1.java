
import java.util.Scanner;

class Watertank {

    int capacity;
    int volume = 0;

    public Watertank(int width, int longe, int height) {
        this.capacity = width * longe * height;
    }

    public int fill(int water) {
        if (volume + water > capacity) {
            return -1;
        } else {
            volume += water;
            return volume;
        }
    }
}

public class Watertank1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt() ;
        int l = sc.nextInt() ;
        int h = sc.nextInt() ;
        Watertank tk = new Watertank(w , l , h);
        for(int i = 0 ; i < 5 ; i ++ ){
            int wat = sc.nextInt() ;
            int vol = tk.fill(wat) ;
            if(vol == -1){
                System.out.println("Cannot fill the tank");
                System.out.println(vol);
            }
            else{
                System.out.println(vol);
            }
            
        }
    }
}
