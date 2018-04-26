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
        
        String startGame = "";
        Scanner userInput = new Scanner(System.in);
        while(!startGame.equals("A")){
        System.out.println("Enter 'A' to start or 'B' to go to instructions.");
        startGame = userInput.next();
               if (startGame.equals("A")) {
               break;
                 } else {
                System.out.flush();  
                System.out.println("Blackjack Rules:");
                 }
        }
      
        int counter = 0;
        
        
        while(Player.money > 0 && counter!= 10){
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
            counter++;
        }
        if (counter == 10){
            System.out.println("Congrats! You made a sum of $" + Player.money);
        } else {
            System.out.println("You are out of money. Don't gamble!");
        }
    }
    
    private static void Invalid(){
        System.out.println("You cannot make that bet. Bet will be set to $0");
        Player.bet = 0;
    }
}
