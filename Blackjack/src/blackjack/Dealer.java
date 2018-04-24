package blackjack;

import java.util.ArrayList;

public class Dealer
{
    public int DealerTotal;
    private ArrayList<Card> dealersHand;
    
    public Dealer ()
    {
        dealersHand = new ArrayList<Card>();
    }
    
    //Draws a card from the deck.
    public void addCardToHand()
    {
        Card drawnCard = new Card();
        dealersHand.add(drawnCard);
    // adds drawn card to dealers's hand
        System.out.println("Dealer drew: " + drawnCard.cardValue);
        DealerTotal += drawnCard.cardValue;
    }
    
    public int getValueOfHand()
    {
        int totalValue = 0;
        
        for (Card card : dealersHand) {
            totalValue += card.cardValue;
        }
        
        return totalValue;
    }  
    
    //runs when the player stands. use the player total
    public void endRound(Player play){
        while(DealerTotal < play.playerTotal){
            this.addCardToHand();
        }
        if(this.DealerTotal > play.playerTotal && this.DealerTotal <= 21){
            System.out.println("Dealer Wins");
        } else if(play.playerTotal > 21){
            System.out.println("Dealer Wins");
        } else {
            System.out.println("Player Wins");
        }
    }
}