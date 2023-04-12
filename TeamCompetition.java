
import java.util.Scanner;

public class TeamCompetition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int match = sc.nextInt();
        int [] team1 = new int [match] ;
        int [] team2 = new int [match] ;
        int score_team1 = 0 ;
        int score_team2 = 0 ;
        for(int i = 0 ; i < match ; i ++){
             team1 [i] = sc.nextInt() ;
        }
        for(int i = 0 ; i < match ; i ++){
             team2 [i] = sc.nextInt() ;
        }
        for(int i = 0 ; i < match ; i ++){
            if(team1 [i] > team2 [i]){
                score_team1 += 2 ;
            }
            else if(team2 [i] > team1 [i]){
                score_team2 += 2 ;
            }
            else if(team1 [i] == team2 [i]){
                score_team1 += 1 ;
                score_team2 += 1 ;
            }
        }
        if(score_team1 > score_team2){
            System.out.println("Team 1 wins");
            System.out.println("Score "+score_team1+" to "+score_team2);
        }
        else if(score_team2 > score_team1){
            System.out.println("Team 2 wins");
            System.out.println("Score "+score_team2+" to "+score_team1);
        }
        else if(score_team1 == score_team2){
            System.out.println("Draw game");
            System.out.println("Score "+score_team1+" to "+score_team2);
        }
    }
    
}
