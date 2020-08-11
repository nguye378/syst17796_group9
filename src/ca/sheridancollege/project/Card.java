/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * 
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Sivagama
 */
public abstract class Card implements CardType {
    //default modifier for child classes
    private Suit suit;
    private Value value;
    
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
    
    public Suit getSuit() {
        return this.suit;
    }
    
    public Value getValue() {
        return this.value;
    }
    
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    public void setValue(Value value) {
        this.value = value;
    }
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */

    
    @Override
    public abstract String toString();
    
}
