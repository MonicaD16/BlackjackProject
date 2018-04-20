package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Deck
{
    private ArrayList<Card> deck;
// '<>' this array list can only contain cards
    public Deck ()
    {
        deck = new ArrayList<Card>();
        
        //creates deck
        for (Suit suit : Suit.values()) {
            for (CardValue value : CardValue.values()) {
            // goes through 52 cards
            
                Card card = new Card(value, suit);
                deck.add(card);
                // . calling property of object. etc. variable or function
                // card.getSuit()
                // would get suit of that card
            }
        }
        
        shuffle();
    }
    //Shuffles the deck by changing the indexes of 200 random pairs of cards in the deck.
    
    //maybe find a more efficient way of shuffling
    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public Card get(int index)
    {
        //Calls the array list get(int index) function, because
        //deck in this class is an array list
        return deck.get(0);
    }
    
    public void remove(int index)
    {
        //Calls the array list remove(int index) function, because
        //deck in this class is an array list
        deck.remove(0);
    }
}