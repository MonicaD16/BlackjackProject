
package blackjack;
import java.util.Scanner;
/**
 *
 * main class
 */
public class Blackjack {


    public static void main(String[] args) {
        
        Game round1 = new Game();
        round1.StartRound();
        String answer;
        
        while(true){
            Scanner reader = new Scanner(System.in);
            System.out.println("Would you like to hit or stand?");
            answer = reader.next();
            reader.close();
            if (answer == "hit"){
                round1.Hit();
            } else {
                break;
            }
        }
        round1.Stand();
    }
    
}
