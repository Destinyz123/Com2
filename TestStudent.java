
import java.util.Scanner;

class Student{
    public String firstname ;
    public String lastname ;
    private int [] stepScore  ;
    
    Student(String firstname , String lastname){
        this.firstname = firstname ;
        this.lastname = lastname ;
        stepScore = new int [4] ;
    }
    int getTestScore(int part){
        return stepScore[part-1] ;
    }
    void setTestScore(int cmd , int point){
        stepScore[cmd-1] = point ;
    }
    int computeTotal(){
        int sum = 0 ;
        for(int i = 0; i < stepScore.length ; i ++){
            sum += stepScore[i] ;
        }
        return sum ;
    }
    void printinfo(){
        System.out.println(firstname+" "+lastname+" "+computeTotal());
    }
}
public class TestStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        Student [] sd = new Student [n] ;
        for(int i = 0; i < n; i++){
            String fname = sc.next() ;
            String lname = sc.next() ;
            sd [i] = new Student (fname , lname) ;
            for(int j = 1; j <= 4 ; j ++){
                int score = sc.nextInt() ;
                sd[i].setTestScore(j, score);
            }
            sd[i].printinfo();
        }
        int k = sc.nextInt() ;
        for(int i = 0 ; i < k ; i ++){
            int rostnum = sc.nextInt() ;
            int tnum = sc.nextInt() ;
            System.out.println(sd[rostnum-1].getTestScore(tnum));
        }
    }
    
}
