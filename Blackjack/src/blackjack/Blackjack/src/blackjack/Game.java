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
        player.playerTotal = 0;
        dealer.DealerTotal = 0;
        player.playersHand.clear();
        dealer.dealersHand.clear();
        //Deal two cards to player 1 to the dealer
        dealer.addCardToHand();
        for (int i = 0; i < 2; i++) {
            player.addCardToHand();
        }
    }
    
    public void checkWhoWins() {
        System.out.println("The value of the dealer's hand is: " + dealer.getValueOfHand());
        System.out.println("The value of your hand is: " + player.getValueOfHand());
        
        if (player.getValueOfHand() > 21) {
            System.out.println("You went over 21! You lose!");
            Player.money -= Player.bet;
        }
        else if (dealer.getValueOfHand() > 21) {
            System.out.println("Dealer went over 21! You win!");
            Player.money += Player.bet;
        }
        else if (player.getValueOfHand() > dealer.getValueOfHand()) {
            System.out.println("Your hand (" + player.getValueOfHand() + ") is greater than the dealer's (" + dealer.getValueOfHand() + ")");
            System.out.println("You win!");
            Player.money += Player.bet;
        }
        else if (player.getValueOfHand() <= dealer.getValueOfHand()) {
            System.out.println("Your hand (" + player.getValueOfHand() + ") is less than or equal to the dealer's (" + dealer.getValueOfHand() + ")");
            System.out.println("You lose!");
            Player.money -= Player.bet;
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
                break;
            }
            else {
                System.out.println("Invalid response. Try again.");
            }
        }
        checkWhoWins();
        //reader.close();
        System.out.println();
    }
}