
import java.util.Scanner;

class Course {

    String subj;
    int[] count;
    int cnt = 0;

    Course(String subj, int max_std) {
        this.subj = subj;
        count = new int[max_std];
    }

    public boolean enroll(int id, Student1[] std) {

        boolean check = true;
        int c = 0;
        int n = 0 ;
        for (int i = 0; i < std.length; i++) {
            if (std[i].id == id) {
                c ++ ;
                n = i ;
            }
        }
        if (c == 0) {
            System.out.print("Invalid ID ");
            check = false;
        } else {
            if (cnt == count.length) {
                check = false;
            } else {
                for (int i = 0; i < cnt; i++) {
                    if (id == count[i]) {
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    System.out.print(std[n].fname + " " + std[n].lname+" ");
                    count[cnt] = id;
                    cnt++;
                }
            }
        }
        return check;
    }

    void printinfo() {
        System.out.println(subj + " " + cnt);
        for (int i = 0; i < cnt; i++) {
            System.out.println(count[i]);
        }
    }
}

class Student1 {

    int id;
    String fname;
    String lname;

    Student1(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    void printInfo() {

    }

}

public class Enrollment1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int P = scan.nextInt();
        Student1[] s = new Student1[P];
        for (int i = 0; i < P; ++i) {
            int id = scan.nextInt();
            String firstName = scan.next();
            String lastName = scan.next();
            s[i] = new Student1(id, firstName, lastName);
        }

        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id, s);
            System.out.println(result);
        }
        co.printinfo();
    }

}
