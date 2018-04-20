package blackjack;
public class Game {

    private static Deck deck; 
    //static = only can be one deck at all times
    private Dealer dealer;
    private Player player;
            
    public Game ()
    {
    player = new Player();    
    deck = new Deck();    
    dealer = new Dealer(); 
    }
 
   public Card drawCard()
    {
        //Calls the Deck get(int index) function, because
        //deck in this class is a Deck
        Card drawnCard = deck.get(0);
        //Calls the Deck remove(int index) function, because
        //deck in this class is a Deck
     
        deck.remove(0);
        return drawnCard;
    }

    public void giveCardtoPlayer(){
        Card drawnCard = drawCard();
        player.addCardToHand(drawnCard);
        //adds card to players hand
        //passing in the card
    }
    public void giveCardtoDealer(){
        Card drawnCard = drawCard();
        dealer.addCardToHand(drawnCard); 
        //functions that give cards to each players hand  
    
    }
      
}