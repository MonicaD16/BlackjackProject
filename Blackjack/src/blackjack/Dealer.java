package blackjack;

import java.util.ArrayList;

public class Dealer
{

    private ArrayList<Card> hand;
    
    public Dealer ()
    {

        hand = new ArrayList<Card>();
    }
    
    //Draws a card from the deck.


 
    public void addCardToHand(Card drawnCard)
    {
        hand.add(drawnCard);
       
        //maybe fix to output suit of card too
        System.out.println("Dealer drew: " + drawnCard.getCardValue());
    }