package String.Basics;
import java.util.List;

public class Game {

    public static String winner(List<Integer> andrea, List<Integer> maria, String s) {
        // Write your code here
        int score1=0, score2=0;

        if(s.equals("Even")) {
            for(int i = 0;i<andrea.size(); i+=2) {
                int value1 = andrea.get(i);
                int value2 = maria.get(i);
                score1 += value1-value2;
                score2 += value2-value1;
            }
            if(score1>score2) {
                return "Andrea";
            } else if(score1<score2) {
                return "Maria";
            } else {
                return "Tie";
            }
        }
        else {
            for(int i = 1;i<andrea.size(); i+=2) {
                int value1 = andrea.get(i);
                int value2 = maria.get(i);
                score1 += value1-value2;
                score2 += value2-value1;
            }
            if(score1>score2) {
                return "Andrea";
            } else if(score1<score2) {
                return "Maria";
            } else {
                return "Tie";
            }
        }
        }
    public static void main(String[] args) {
        
    }
}
