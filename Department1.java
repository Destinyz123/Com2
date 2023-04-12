
import java.util.Scanner;

class Dept{
    int ministryBudget ;
    int eduFee ;
    int serviceFee ;
    int donation ;
    public Dept(int teacher , int student){
        computeIncome(teacher , student) ;
}
    public void computeIncome(int tch , int std){
        this.ministryBudget = (tch * 500000) + (std * 3000) ;
        this.eduFee = std * 5000 ;
        this.serviceFee = 300000 ;
        this.donation = 100000 ;
    }
    public void printReport(){
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = "+serviceFee);
        System.out.println("donation = "+donation);
    }
}
public class Department1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int teach = sc.nextInt() ;
        int stud = sc.nextInt() ;
        Dept comp = new Dept (teach , stud);
        comp.printReport();
    }
    
}
