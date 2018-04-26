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
                System.out.println("1. Blackjack consists of a 52-card deck.");
                System.out.println("2. Both the player and dealer are dealt with two cards, however, the player is only given the value of one of the dealer's cards.");
                System.out.println("3. The player can then decide to 'hit' or 'stand.' If they hit, the player receives another card. Standing reveals the value of the card that the dealer has.");
                System.out.println("4. If the player has a higher value than the dealer, the dealer will continue to draw new cards until they have reached a value higher than the player or have exceeded a value of 21.");
                System.out.println("5. If the dealer is over 21, the player wins the amount that they bet, otherwise they lose the value of their bet. ");
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
        int totalMade = (Player.money)-(1000);
        if (counter == 10){
            System.out.println("Congrats! You made a value of $" + totalMade);
            System.out.println("Your total value is $" + Player.money);
        } else {
            System.out.println("You are out of money. Don't gamble!");
        }
    }
    
    private static void Invalid(){
        System.out.println("You cannot make that bet. Bet will be set to $0");
        Player.bet = 0;
    }
}
