
import java.util.Scanner;

class CPU {

    public String cpu;
    public int overclock;
    public int socket;
    public int ram;
    public boolean check;

    CPU(String cpu, int overclock, int socket, int ram) {
        this.cpu = cpu;
        this.overclock = overclock;
        this.socket = socket;
        this.ram = ram;
        check = isValidSpec(cpu, overclock, socket, ram);
    }

    public boolean isValidSpec(String cu, int ovk, int sk, int r) {
        boolean ck = true;

        if (cu == null || cu.length() == 0 || ovk <= 0 || r <= 0 || r > 10 || sk <= 0) {
            ck = false;
        }
        return ck;
    }

    public void printfInfo() {
        System.out.println(cpu);
        System.out.println(overclock);
        System.out.println(socket);
        System.out.println(ram);
        System.out.println(check);
    }
}

class MainBoard {

    public String namecpu;
    public int socketmb;
    public int rammb;
    public boolean validmb;

    MainBoard(String namecpu , int socketmb , int rammb) {
        this.namecpu = namecpu ;
        this.socketmb = socketmb ;
        this.rammb = rammb ;
        validmb = isValidSpec(namecpu , socketmb , rammb) ;
    }

    public boolean isValidSpec(String cumb , int skmb , int rmb) {
        boolean vd = true;
        if(cumb == null || cumb.length() == 0 || rmb <= 0 || rmb > 10 || skmb <= 0){
            vd = false ;
        }
        return vd ;
    }
    public void printInfo(){
        System.out.println(namecpu);
        System.out.println(socketmb);
        System.out.println(rammb);
        System.out.println(validmb);
    }
}

class Computer {
    CPU cpu ;
    MainBoard mb ;
    boolean valid ;
    
    Computer(CPU cpu , MainBoard mb) {
        this.cpu = cpu ;
        this.mb = mb ;
        valid = isValidCom(cpu , mb);
    }
    public boolean isValidCom(CPU c , MainBoard m){
        boolean check = true ;
        if(c.socket != m.socketmb 
                || c.ram != m.rammb
                || c.check == false
                || m.validmb == false){
            check = false ;
        }
        return check ;
    }
    public void printInfo(){
        if(valid == true){
            System.out.println(cpu.cpu);
            System.out.println(cpu.overclock);
            System.out.println(mb.namecpu);
            System.out.println(cpu.socket);
            System.out.println(cpu.ram);
        }
        else{
            System.out.println("Invalid Spec");
            cpu.printfInfo();
            mb.printInfo();
        }
    }
}

public class MBCompat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int clocks = sc.nextInt();
        int socket = sc.nextInt();
        int memType = sc.nextInt();

        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        CPU c = new CPU(model, clocks, socket, memType);
        sc.nextLine() ;
        model = sc.nextLine() ;
        socket = sc.nextInt() ;
        memType = sc.nextInt() ;
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        MainBoard mb = new MainBoard(model , socket , memType) ;
        Computer com = new Computer(c , mb) ;
        com.printInfo();
    }

}
