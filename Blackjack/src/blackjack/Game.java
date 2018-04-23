package blackjack;
public class Game {

    private Dealer dealer;
    private Player player;
            
    public Game ()
    {
    player = new Player();    
    dealer = new Dealer(); 
    }
    public void StartRound(){
        dealer.addCardToHand();
        player.addCardToHand();
        player.addCardToHand();
        System.out.println("The player total is: " +player.playerTotal);
        System.out.println("The dealer total is: " +dealer.DealerTotal);
    }
    
    public void Hit(){
        player.addCardToHand();
        if(player.playerTotal >=21){
            dealer.endRound(player);
            Card.shuffleCards();
        }
    }
    public void Stand(){
        dealer.endRound(player);
        Card.shuffleCards();
    }
    
 
   
      
}