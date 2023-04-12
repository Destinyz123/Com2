
import java.util.Scanner;

class Encoder{
    String [] word ;
    int [] code ;
    Encoder(String [] word , int [] code){
        this.word = new String [word.length] ;
        this.code = new int [code.length] ;
        for(int i = 0 ; i < word.length ; i ++){
            this.word[i] = word[i] ;
            this.code[i] = code[i] ;
        }
    }
    private int encodeWord(String str){
        
        for(int i = 0 ; i < word.length ; i ++ ){
            if(word[i].equals(str)){
                 return code[i] ;               
            }
        }
        return -1 ;
        
    }
    int[] encodeMsg(String [] str){
        int [] keep = new int [str.length] ; 
        for(int i = 0 ; i < str.length ; i ++){
             keep[i] = encodeWord(str[i]) ;
        }
        return keep ;
    }
}
class Decoder{
    String [] str ;
    int [] num ;
    Decoder(String [] str , int [] num){
        this.str = new String [str.length] ;
        this.num = new int [num.length] ;
        for(int i = 0 ; i < str.length ; i ++){
            this.str[i] = str[i] ;
            this.num[i] = num[i] ;
        }
    }
    private String decodeWord(int digi){
        if(digi != -1){
            for(int i = 0 ; i < str.length ; i ++ ){
                if(num[i] == digi){
                    return str[i] ;
                }
            }
        }
        return "?" ;
    }
    String decodeMsg(int [] num){
        String Msg = "" ;
        for(int i = 0 ; i < num.length ; i ++){
            Msg += decodeWord(num[i]) + " " ;
        }
        return Msg ;
    }
}
public class EnDecoder1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        String [] word = new String [n] ;
        int [] code = new int [n] ;
        for(int i = 0 ; i < n ; i ++ ){
            word[i] = sc.next() ;
        }
        for(int i = 0 ; i < n ; i ++ ){
            code [i] = sc.nextInt() ;
        }
        Encoder ecd = new Encoder (word , code) ;
        Decoder dcd = new Decoder (word , code) ;
        int k = sc.nextInt() ;
        int[] en = new int[k];
        String [] deword = new String [k] ; 
        String [] ch = new String [k] ;       
        for(int i = 0 ; i < k ; i ++ ){
            ch[i] = sc.next() ;
        }
        en = ecd.encodeMsg(ch) ;
        System.out.println(dcd.decodeMsg(en));
       
    }
    
}
