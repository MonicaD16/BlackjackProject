package blackjack;

import java.util.ArrayList;

public class Dealer
{
    private ArrayList<Card> dealersHand;
    
    public Dealer ()
    {

        dealersHand = new ArrayList<Card>();
    }
    
    //Draws a card from the deck.
 
    public void addCardToHand(Card drawnCard)
    {
        dealersHand.add(drawnCard);
       
        //maybe fix to output suit of card too
        System.out.println("Dealer drew: " + drawnCard.getCardValue());
    }
}