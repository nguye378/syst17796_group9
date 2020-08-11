/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * 
 */

// used so classes can access the card suits and values

public interface CardType {
    public enum Suit{ CLUBS, SPADES, DIAMONDS, HEARTS };
    public enum Value{ TWO, THREE, FOUR, FIVE,
    SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE };
}
