
import java.util.Scanner;

class Blade {

    int size;
    int number;
    int angle;
    double hp;
    boolean valid = true;

    Blade(int size, int number, int angle, double hp) {
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.hp = hp;
    }

    public void printInfo() {
        if (size % 2 == 0) {
            if (size < 16 || size > 24) {
                System.out.println("invalid size");
                valid = false;
            }
        } else {
            valid = false;
            System.out.println("invalid size");
        }
        if (number < 3 || number > 5) {
            System.out.println("invalid number of blades");
            valid = false;
        }
        if (angle != 27 && angle != 30 && angle != 33) {
            System.out.println("invalid angle");
            valid = false;
        }
        if (hp <= 0) {
            System.out.println("invalid horsepower");
            valid = false;
        }
        System.out.println(size + " " + number + " " + angle + " " + hp + " " + valid);
    }

}

class Motor {

    double volt;
    double amphere;
    double eff;

    Motor(double volt, double amphere, double eff) {
        this.volt = volt;
        this.amphere = amphere;
        this.eff = eff;
    }

    Motor(double amphere, double eff) {
        this(220, amphere, eff);
    }

    public double horsepower() {
        double HP = 0.0;
        HP = ((volt * amphere * eff) / 100) / 746;
        return HP;
    }

    public void printInfo() {
        double hp = horsepower();
        System.out.println(volt + " " + amphere + " " + eff / 100 + " " + String.format("%.2f", hp));
    }
}

class ElectricFan {

    int productID;
    Blade bd;
    Motor mt;
    static int count = 0;
    boolean status = true;

    ElectricFan(Blade bd, Motor mt) {
        count++;
        this.bd = bd;
        this.mt = mt;
        if (mt.horsepower() >= bd.hp) {
            status = true;
        } else {
            status = false;
        }
    }

    public void changBlade(Blade bl) {
        this.bd = bl ;
        if (mt.horsepower() >= bl.hp) {
            status = true;
        } else {
            status = false;
        }
    }

    public void changeMotor(Motor mr) {
        this.mt = mr ;
        if (mr.horsepower() >= bd.hp) {
            status = true;
        } else {
            status = false;
        }
    }

    public void printInfo() {
        System.out.println(count + " " + bd.size + " " + bd.hp + " " + mt.amphere + " " + String.format("%.2f", mt.horsepower()) + " " + status);
    }
}

public class FanCompany1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size, numb, angle;
        double hp, v, i, eff;
        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan = null;
        for (int index = 0; index < n; index++) {
            int cmd = sc.nextInt();
            if (cmd == 0) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan = new ElectricFan (ablade , motor) ; 
            }
            else if(cmd == 1){
                size = sc.nextInt() ;
                numb = sc.nextInt() ;
                angle = sc.nextInt() ;
                hp = sc.nextDouble() ;
                ablade = new Blade(size , numb , angle , hp) ;
                eFan.changBlade(ablade);
            }
            else{
                v = sc.nextDouble() ;
                i = sc.nextDouble() ;
                eff = sc.nextDouble() ;
                motor = new Motor(v , i , eff) ;
                eFan.changeMotor(motor);
            }
            eFan.printInfo();
        }
    }
}