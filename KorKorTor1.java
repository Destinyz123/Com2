
//import java.util.Scanner;
//
//class Party {
//
//    String group;
//    int people;
//    String[] firstname;
//    String[] lastname;
//    int[] area;
//
//    Party(String group, int people, Scanner sc) {
//        this.group = group;
//        this.people = people;
//        firstname = new String[people + 1];
//        lastname = new String[people + 1];
//        area = new int[people + 1];
//        for (int i = 1; i <= people; i++) {
//            firstname[i] = sc.next();
//            lastname[i] = sc.next();
//            area[i] = sc.nextInt();
//        }
//    }
//
//    public void printinfo(int cmd) {
//        
//        if (cmd == 0) {
//            for (int i = 1; i <= people; i++) {
//                System.out.println(firstname[i] + " " + lastname[i] + " " + area[i]);
//            }
//        } else if (cmd < 0) {
//            System.out.println("invalid region number");
//        } else {
//            int count = 0 ;
//            for (int i = 1; i <= people; i++) {
//                if (cmd == area[i]) {
//                    System.out.println(firstname[i] + " " + lastname[i]);
//                    count ++ ;
//                }
//            }
//            if(count == 0){
//                System.out.println("none");
//            }
//        }
//    }
//}
//
//public class KorKorTor1 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Party[] py = new Party[n + 1];
//        String[] name = new String[n + 1];
//        int k[] = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            name[i] = sc.next();
//            k[i] = sc.nextInt();
//        }
//        for (int i = 1; i <= n; i++) {
//            py[i] = new Party(name[i], k[i], sc);
//        }
//        final int rd = sc.nextInt();
//        for (int i = 0; i < rd; i++) {
//            int num_g = sc.nextInt();
//            int area = sc.nextInt();
//            py[num_g].printinfo(area);
//        }
//    }
//
//}


