package blackjack;

import java.util.ArrayList;

public class Player 
{
    
    private ArrayList<Card> playersHand;
    
    public Player ()
    {
        playersHand = new ArrayList<Card>();
    }
   

    public void addCardToHand(Card drawnCard)
    //function needs a card - needs to know its taking in a card
    {

        playersHand.add(drawnCard);
    // adds drawn card to player's hand
        System.out.println("Player drew: " + drawnCard.getCardValue());
    }
    
    //add players bet
   // public static int handValue; 
    
    
}

