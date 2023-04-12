
import java.util.Scanner;

class FieldManager{
    int [] free ;
    int bed ;
    
    FieldManager(int bed){
        this.bed = bed;
        free  = new int [bed] ; 
    }
    public int reserveBed(){
        for(int i = 0 ; i < bed ; i ++ ){
            if(free[i] == 0){
                free[i] ++ ;
                return i+1 ;                
            }           
        }
        return -1 ;
    }
    public boolean discharge(int numb_bed){
        if(free [numb_bed-1] == 1){
            free[numb_bed-1] -- ;
            System.out.println("Patient discharged");
            return true ;
        }
        else{
            System.out.println("Invalid bed number"); 
            return false ;
        }     
    }
    public void reportBed(){
        int count = 0 ;
        for(int i = 0 ; i < bed ; i ++ ){
            if(free[i] == 1){
                count ++ ;
            }
        }
        System.out.println(count+"        ");
    }
}
public class FieldHospital {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        final int bed = sc.nextInt() ;
        FieldManager fm = new FieldManager(bed) ;
        final int patient = sc.nextInt() ;
        for(int i = 0 ; i < patient ; i ++ ){
            int command = sc.nextInt() ;
            int a = sc.nextInt() ;
            if(command == 1){
                int get = fm.reserveBed() ;
                if(get != -1){
                    System.out.println("Bed "+get+" reserved");
                }
                else if(get == -1){
                    System.out.println("No bed vacancy");
                }
            }
            else if(command == 2){
                fm.discharge(a) ;
            }
            else{
                fm.reportBed();
            }
        }
    }
    
}
