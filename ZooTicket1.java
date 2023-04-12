
import java.util.Scanner;

class ZooTicket {

    String name;
    int cr = 0;
    int cs = 0;
    int ct = 0;
    int countride = 0 ;
    int countseal = 0 ;
    int counttiger = 0 ;
    int total = 100;

    ZooTicket(String name) {
        this.name = name;
    }

    public void bookRide() {
        cr++;
        total += 40;
    }

    public void bookSealShow() {
        cs++;
        total += 50;
    }

    public void bookTigerShow() {
        total += 65;
        ct++;
    }

    public int summarize() {
        System.out.println(name);
        if (cr != 0) {
            System.out.println("Ride");
        }
        if (cs != 0) {
            System.out.println("Seal");
        }
        if (ct != 0) {
            System.out.println("Tiger");
        }
        return total;
    }

    public boolean useRide() {
        
        if (cr != 0 && countride == 0) {
            System.out.println("okay");
            countride++;
            return true;
        } else {
            System.out.println("no");
            return false;
        }
    }

    public boolean enterSealShow() {
        
        if (cs != 0 && countseal == 0) {
            countseal++;
            System.out.println("okay");
            return true;
        } else {
            System.out.println("no");
            return false;
        }
    }

    public boolean enterTigerShow() {
        if (ct != 0 && counttiger == 0) {
            counttiger++;
            System.out.println("okay");
            return true;
        } else {
            System.out.println("no");
            return false;
        }
    }
}



public class ZooTicket1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ticketname = sc.next();
        ZooTicket zt = new ZooTicket(ticketname);
        for (;;) {
            int cmd = sc.nextInt();
            if (cmd == 0) {
                break;
            }

            if (cmd == 1) {
                zt.bookRide();
            } else if (cmd == 2) {
                zt.bookSealShow();
            } else {
                zt.bookTigerShow();
            }
        }
        int total = zt.summarize();
        System.out.println(total);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            boolean check;
            if (k == 1) {
                check = zt.useRide();
            } else if (k == 2) {
                check = zt.enterSealShow();
            } else {
                check = zt.enterTigerShow();
            }
            System.out.println(check);
        }
    }

}
