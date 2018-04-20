package blackjack;

public class Card
{
  
  public static int[] cardsInPlay = {0};
  public int cardValue;
  public Card ()
  {
    int num = 0;
              
    boolean notInUse = false;
    while (notInUse == false){
        num = 1 + (int)(Math.random() * 51);
        for (int i = 0; i<= cardsInPlay.length;i++ ){
            if (cardsInPlay[i] == num){
                notInUse = false;
                break;
            } else {
                notInUse = true;
            }
        }
    }
    num = (int) num/4;
    if(num >= 10){
        num = 10;
    }
    this.cardValue = num;
  }
  
    public static void shuffleCards(){
        int[] reset = {0};
        cardsInPlay = reset;
    }
}