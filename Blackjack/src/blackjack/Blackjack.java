package blackjack;
import java.util.Scanner;
/**
 *
 * main class
 */
public class Blackjack {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Game game = new Game();
        
        while(Player.money > 0){
            System.out.println("You have $" + Player.money);
            System.out.println("What would you like to bet?");
            try {
                int val = reader.nextInt();
                if(val <= Player.money){
                    Player.bet = val;
                } else{
                    Invalid();
                }
            } catch (Exception e){
                Invalid();
            }
            System.out.println();
            game.Start();
        }
        System.out.println("You are out of money. Don't gamble!");
    }
    
    private static void Invalid(){
        System.out.println("You cannot make that bet. Bet will be set to $0");
        Player.bet = 0;
    }
}