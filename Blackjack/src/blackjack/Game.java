package blackjack;

import java.util.Scanner;

public class Game {

    private Dealer dealer;
    private Player player;
  
    public Game ()
    {
        player = new Player();    
        dealer = new Dealer(); 
    }
    
    public void DealHands() {
        //Deal two cards to dealer and player
        for (int i = 0; i < 2; i++) {
            dealer.addCardToHand();
            player.addCardToHand();
        }
    }
    
    public void checkWhoWins() {
        System.out.println("The value of the dealer's hand is: " + dealer.getValueOfHand());
        System.out.println("The value of your hand is: " + player.getValueOfHand());
        
        if (player.getValueOfHand() > 21) {
            System.out.println("You went over 21! You lose!");
        }
        else if (dealer.getValueOfHand() > 21) {
            System.out.println("Dealer went over 21! You win!");
        }
        else if (player.getValueOfHand() > dealer.getValueOfHand()) {
            System.out.println("Your hand (" + player.getValueOfHand() + ") is greater than the dealer's (" + dealer.getValueOfHand() + ")");
            System.out.println("You win!");
        }
        else if (player.getValueOfHand() <= dealer.getValueOfHand()) {
            System.out.println("Your hand (" + player.getValueOfHand() + ") is less than or equal to the dealer's (" + dealer.getValueOfHand() + ")");
            System.out.println("You lose!");
        }
    }

    public void Start() {
        Scanner reader = new Scanner(System.in);
        
        DealHands();

        while (true) {
            System.out.println("The value of the dealer's hand is: " + dealer.getValueOfHand());
            System.out.println("The value of your hand is: " + player.getValueOfHand());
            System.out.println("Would you like to hit or stand?");
            String answer = reader.next();
            
            if (answer.toLowerCase().equals("hit")) {
                player.addCardToHand();
                
                //Player lost
                if (player.getValueOfHand() > 21) {
                    break;
                }
            }
            else if (answer.toLowerCase().equals("stand")) {
                while (dealer.getValueOfHand() < 17) {
                    dealer.addCardToHand();
                }
                
                System.out.println("The value of the dealer's hand is: " + dealer.getValueOfHand());
                System.out.println("The value of your hand is: " + player.getValueOfHand());
                break;
            }
            else {
                System.out.println("Invalid response. Try again.");
            }
        }
        
        reader.close();
    }
}