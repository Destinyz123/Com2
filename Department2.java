
import java.util.Scanner;

class Dept1{
    int ministryBudget ;
    int eduFee ;
    int serviceFee ;
    int donation ;
    int salary ;
    int elec ;
    int eduCost ;
    public Dept1(int teacher , int student){
        computeIncome(teacher , student) ;
        computeExpense(teacher , student) ;
        System.out.println("total income = "+(ministryBudget+eduFee+serviceFee+donation));
        System.out.println("total expense = "+(salary+elec+eduCost));
        System.out.println("income - expense = "+((ministryBudget+eduFee+serviceFee+donation) - (salary+elec+eduCost)));
}
    public void computeIncome(int tch , int std){
        this.ministryBudget = (tch * 500000) + (std * 3000) ;
        this.eduFee = std * 5000 ;
        this.serviceFee = 300000 ;
        this.donation = 100000 ;
    }
    public void computeExpense(int teah , int stud){
        this.salary = teah * 600000 ;
        this.elec = (teah + stud) * 2000 ;
        this.eduCost = stud * 4000 ;
    }
    public void printReport(){
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = "+serviceFee);
        System.out.println("donation = "+donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = "+eduCost);
    }
}
public class Department2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int teach = sc.nextInt() ;
        int stud = sc.nextInt() ;
        Dept1 comp = new Dept1 (teach , stud);
        comp.printReport();
    }
    
}
