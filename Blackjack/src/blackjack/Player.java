package blackjack;

import java.util.ArrayList;

public class Player 
{
    //player total is the score the player has
    public int playerTotal;
    private ArrayList<Card> playersHand;
    
    public Player ()
    {
        playersHand = new ArrayList<Card>();
    }
   
    public void addCardToHand()
    {
        Card drawnCard = new Card();
        playersHand.add(drawnCard);
    // adds drawn card to player's hand
        System.out.println("Player drew: " + drawnCard.cardValue);
        playerTotal += drawnCard.cardValue;
    }  
    
    public int getValueOfHand()
    {
        int totalValue = 0;
        
        for (Card card : playersHand) {
            totalValue += card.cardValue;
        }
        
        return totalValue;
    }  
}