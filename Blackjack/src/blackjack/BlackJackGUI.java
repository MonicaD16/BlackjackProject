
package blackjack;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BlackJackGUI extends JPanel
{
  JPanel topPanel = new JPanel();
  JPanel dcardPanel = new JPanel();
  JPanel pcardPanel = new JPanel();
  JTextPane winlosebox = new JTextPane();
  JButton hitbutton = new JButton();
  JButton dealbutton = new JButton();
  JButton staybutton = new JButton();
  JButton playagainbutton = new JButton();
  JLabel dealerlabel = new JLabel();
  JLabel playerlabel = new JLabel();

  Hand dealer = new Hand();    //to hold the dealer's cards
  Hand player = new Hand();    //to hold the player's cards
  Blackjack Game = new Blackjack(Dealer,Player); 
