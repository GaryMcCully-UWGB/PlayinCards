/*This is a small program designed to simulate the game of BlackJack
*/

import java.util.*;
import java.text.*;

public class PlayingCards
{
  static Random randNum = new Random();

  int userScore;
  int houseScore;
  int userWins;
  int houseWins;

//PlayingCards constructor
  public PlayingCards()
  {
    userScore=0;
    houseScore=0;

    userWins=0;
    houseWins=0;
  }

  public static ArrayList<String> createDeck()
  {
    String[] suit = {"Spades", "Diamonds", "Clubs", "Hearts"};
    String[] value = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

    ArrayList<String> createdDeck = new ArrayList<String>();

    for(int i=0; i<4; i++)
    {
      for(int j=0; j<13; j++)
      {
        String card=suit[i]+"-"+value[j];
        createdDeck.add(card);
      }
    }
    return createdDeck;
  }
  
  public static ArrayList<String> shuffleDeck(ArrayList<String> unshuffledDeck)
  {
    String card1Value;
    String card2Value;
    for(int i=0; i<500; i++)
    {
      int cardIndex1 = randNum.nextInt(52);
      int cardIndex2 = randNum.nextInt(52);

      card1Value=unshuffledDeck.get(cardIndex1);
      card2Value=unshuffledDeck.get(cardIndex2);
      unshuffledDeck.set(cardIndex1, card2Value);
      unshuffledDeck.set(cardIndex2, card1Value);
    }
    
    return unshuffledDeck;
  }
  
  public static int getCardValue(String card)
  {
    
    return 0;
  }
  
  public static void blackJack()
  {
    //Variable Setup
    ArrayList<String> deck = new ArrayList<String>();
    ArrayList<String> shuffled = new ArrayList<String>();
    PlayingCards game = new PlayingCards();
    
    //Game Setup
    deck=game.createDeck();
    System.out.println(deck);
    shuffled=game.shuffleDeck(deck);
    System.out.println(shuffled);
  }

  //Main Method simply starts the program
  public static void main(String[] args)
  { 
    blackJack();
  }
}
