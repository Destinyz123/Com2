
import java.util.Scanner;

public class ZeroOrMore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cut = sc.next();
        String str = sc.next();
        String need = "*";
        int mul = cut.indexOf(need);
        String get_back = "";
        String get_forward = "";
        if (mul == 0) {
            get_back = cut.substring(1);
            String[] back = str.split(get_back);
            for (int i = 0; i < back.length; i++) {
                System.out.println(back[i]);
            }
        }  else if (mul == cut.length()-1) {
            get_forward = cut.substring(0,mul);
            String[] forw = str.split(get_forward);
            String get = "";
            for (int i = 0; i < forw.length; i++) {
                if (forw[i] != "") {
                    get = forw[i];
                }
            }
            System.out.println(get);
        }
        else if (mul != cut.length()-1) {
            get_back = cut.substring(mul + 1);
            get_forward = cut.substring(0, mul);
            String keep = "";
            String[] mix = str.split(get_back);
            String[] finish = mix[0].split(get_forward);
            for (int i = 0; i < finish.length; i++) {
                if (finish[i] != "") {
                    keep = finish[i];
                }
            }
            System.out.println(keep);
        }
    }

}
