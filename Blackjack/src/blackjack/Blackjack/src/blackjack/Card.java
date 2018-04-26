package blackjack;

public class Card
{
  //List of cards that cannot be used because they are in play
  public static int[] cardsInPlay = new int[30];
  public int cardValue;
  public Card ()
  {
    //num is the card. ie. 1 to 52 having a rorresponding card
    int num = 0;
    //this basically just gives the card a random value based on the cards in play
    boolean notInUse = false;
    while (notInUse == false){
        num = 1 + (int)(Math.random() * 51);
        for (int i = 0; i<= cardsInPlay.length -1;i++ ){
            if (cardsInPlay[i] == num){
                notInUse = false;
                break;
            } else {
                notInUse = true;
            }
        }
    }
    //52 cards 4 suits. divide by 4 and you get the number of the card
    num = (int) num/4;
    //if it's a 10, jack queen or king, its 10 otherwise it's all good
    if(num >= 10){
        num = 10;
    }
    this.cardValue = num;
  }
  
    public static void shuffleCards(){
        //resets the cards in play. turning this off would allow for card counting
        int[] reset = {0};
        cardsInPlay = reset;
    }
}