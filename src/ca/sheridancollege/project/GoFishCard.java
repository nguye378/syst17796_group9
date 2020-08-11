/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;

/**
 *
 * @author James* 
 */

import java.util.ArrayList;

public class GoFishCard extends Card implements CardType {
    
    public GoFishCard(Suit s, Value v) {
        super(s, v);
    }
    
    // will grab ranks so game knows which one player has
    
    @Override
    public String toString() {
        return this.getValue() + " of " + this.getSuit();
    }
}
