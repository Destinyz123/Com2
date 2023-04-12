
import java.util.Scanner;

class Character {

    private String[] sound;
    private int i = 0;
    private int n;

    public Character(String[] sound) {
        this.sound = sound;
        n = sound.length;
    }

    public void speak() {
        System.out.println(sound[i]);
        i = (i + 1) % n;

    }
}

public class CharVoice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String[] voice = new String[n];
        Character[] ct = new Character[n + 1];
//        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                voice[i] = sc.nextLine();
            }
            ct[i] = new Character(voice);
        }
        final int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int cmd = sc.nextInt();
            ct[cmd].speak();
        }

    }

}
