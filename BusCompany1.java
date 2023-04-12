
import java.util.Scanner;

class Bus {

    String namebus;
    int typebus;
    private int seat;
    private int current;
    private boolean active;

    public Bus(String namebus, int typebus, int seat) {
        this.namebus = namebus;
        this.typebus = typebus;
        this.seat = seat;
        this.current = 0;
        this.active = true;
    }

    public void printStats() {
        System.out.println(namebus);
        if (typebus == 1) {
            System.out.println("Fan");
        } else if (typebus == 2) {
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }
        System.out.println(current + " " + seat);
        if (active) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }

    public boolean reserve(int human) {
        if (human <= 0 || seat - current < human || active == false) {
            return false;
        } else {
            current += human;
            return true;
        }
    }
    public void sendToRepair(){
        active = false ;
    }
    public void backToService(){
        active = true ;
    }
}

public class BusCompany1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        Bus [] bs = new Bus [n] ;
        for(int i = 0 ; i < n ; i ++ ){
            String name = sc.next();
            int type = sc.nextInt();
            int sit = sc.nextInt();
            bs [i] = new Bus(name , type , sit) ;
        }       
        int val_hu = sc.nextInt();
        for (int i = 0; i < val_hu; i++) {
            int cmd = sc.nextInt();
            int hucome = sc.nextInt();
            int k = sc.nextInt() ;
            if(cmd == 1){
                boolean wp = false ;
                for(int j = 0 ; j < bs.length ; j ++ ){
                    if(bs[j].typebus == k){
                        boolean sv = bs[j].reserve(hucome) ;
                        if(sv == true){
                            System.out.println(bs[j].namebus);
                            wp = true ;
                            break ;
                        }
                    }
                }
                if(wp == false){
                    System.out.println("sorry");
                }
            }
            else if(cmd == 2){
                bs[k-1].sendToRepair(); 
            }
            else if(cmd == 3){
                bs[k-1].backToService();
            }
            
        }
    }

}
