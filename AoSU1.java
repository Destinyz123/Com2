
import java.util.Scanner;


class Hero {

    String name;
    int hp;
    int atk;
    int phydef;
    int typeatk;
    int magicdef;
    int countm = 0;

    Hero(String name, int hp, int typeatk, int atk, int phydef, int magicdef) {
        this.name = name;
        this.hp = hp;
        this.typeatk = typeatk;
        this.atk = atk;
        this.phydef = phydef;
        this.magicdef = magicdef;
        if (hp < 0 || atk < 0 || phydef < 0 || magicdef < 0) {
            countm++;
        }
        if (countm > 0) {
            System.out.println("warning: value cannot be negative");
        }

    }

    void printInfo() {
       
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        if (typeatk == 1) {
            System.out.println("Attack: " + atk + " (physical)");
        } else {
            System.out.println("Attack: " + atk + " (magical)");
        }
        System.out.println("Defense: " + phydef + " (physical), " + magicdef + " (magical)");
        if (countm > 0) {
            System.out.println("warning: value cannot be negative");
        }
    }

    boolean checkAndWarn() {
        int count = 0;
        if (hp < 0 || atk < 0 || phydef < 0 || magicdef < 0) {
            count++;
        }
        if (count > 0) {
            System.out.println("warning: value cannot be negative");
            return false;
        }
        return true;
    }

}

public class AoSU1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String name = sc.next() ;
        int hp = sc.nextInt() ;
        int attkType = sc.nextInt() ;
        int attkDmg = sc.nextInt() ;
        int phyDef = sc.nextInt() ;
        int magDef = sc.nextInt() ;
        Hero hero = new Hero (name , hp , attkType , attkDmg , phyDef , magDef) ;
        hero.printInfo(); 
        System.out.println(hero.checkAndWarn());
    }

}
