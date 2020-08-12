/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;


/**
 *
 * 
 */
public class Deck extends GroupOfCards implements CardType{
    private int cardCount;
    
    public Deck() {
        super(52);
        this.cardCount = 52;
    }
    
    // creates deck and shuffles
    public void createDeck() {
        for (Suit s : Suit.values()) {
            for (Value v: Value.values()) {
                this.addCard(new GoFishCard(s, v));
            }
        }
    }
    
    public int getCardCount() {
        return this.cardCount;
    }
    
    public Card dealCard() {
        Card c = this.remove(cardCount - 1);
        cardCount -= 1;
        return c;
    }
    
}
