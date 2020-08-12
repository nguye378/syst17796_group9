/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Sivagama
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize)
    {   
        size = givenSize;
        this.cards = new ArrayList<Card>(size);
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    public void displayCardsList() {
        for (int i = 0; i < this.returnSize(); i ++) {
            System.out.println((i + 1) + " : " + this.cards.get(i));
        }
    }
    
    public void displayCardsRankList() {
        for (int i = 0; i < this.returnSize(); i ++) {
            System.out.println((i + 1) + " : " + this.cards.get(i));
        }
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    // custom classes
    public void addCard(Card card) {
        this.cards.add(card);
    }
    
    public void removeCard(Card card) {
        this.cards.remove(card);
    }

    // remove by index and return card
    public Card remove(int index) {
        return this.cards.remove(index);
    }
    
    public int returnSize() {
        return this.cards.size();
    }
    
}//end class
