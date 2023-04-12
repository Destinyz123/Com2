
import java.util.ArrayList;
import java.util.Scanner;

class Animal {

    String name;
    int lifeexp;
    int age = 0;

    Animal(String name, int lifeexp) {
        this.name = name;
        this.lifeexp = lifeexp;
        System.out.println(name + " was born with life expectancy " + lifeexp + " year(s)");
    }

    public void live(int k) {
        if (age + k < lifeexp) {
            if (k == 1) {
                System.out.println(name + " lived " + k + " more year");
            } else {
                System.out.println(name + " lived " + k + " more years");
            }

            age += k;
        } else if (lifeexp - (age + k) == 1 && age + k < lifeexp) {
            System.out.println(name + " lived 1 more year and died");
            age += k;
        } else if (age + k >= lifeexp && lifeexp - age > 0) {
            if (lifeexp - age == 1) {
                System.out.println(name + " lived 1 more year and died");
            } else {
                System.out.println(name + " lived " + (lifeexp - age) + " more years and died");
            }
            age += k;
        } else {
            System.out.println(name + " died earlier");
        }
    }

    void vaccine() {
        System.out.println(name + "'s life expectancy is now " + lifeexp + " year(s)");
    }

    public boolean isAlive() {
        if (age >= lifeexp) {
            return false;
        } else {
            return true;
        }
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name, 8);
    }
    int check = 0;
    void vaccine() {
        if (check == 0) {        
            if(super.isAlive() == true){                
             lifeexp = ((lifeexp-age)*2)+age ;
             check ++ ;
            }            
        }
        super.vaccine();
        check++;
    }

}

class Turtle extends Animal {

    Turtle(String name) {
        super(name, 50);
    }
}

class Salmon extends Animal {

    Salmon(String name) {
        super(name, 4);
    }
}

public class AnimalDomain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        ArrayList<Animal> al = new ArrayList<>() ;
        for (int i = 0; i < n; i++) {
            int cmd = sc.nextInt();
            if (cmd == 1) {
                int type = sc.nextInt() ;
                String name = sc.next() ;
                if(type == 1){
                    Dog d = new Dog(name) ;
                    al.add(d) ;                   
                }
                else if(type == 2){
                    Turtle tt = new Turtle(name) ;
                    al.add(tt) ;
                }
                else if(type == 3){
                    Salmon sm = new Salmon(name) ;
                    al.add(sm) ;
                }
            } else if (cmd == 2) {
                    int rank = sc.nextInt()-1 ;
                    int k = sc.nextInt() ;
                    al.get(rank).live(k);
            } else if (cmd == 3) {
                int id = sc.nextInt()-1;
                if (al.get(id).isAlive() == true) {
                    System.out.println(al.get(id).name + " is alive");
                } else {
                    System.out.println(al.get(id).name + " is dead");
                }
            } else {
                    int iden = sc.nextInt()-1 ;
                    al.get(iden).vaccine();
            }
        }

    }

}
