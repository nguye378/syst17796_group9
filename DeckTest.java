/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * /CREATED BUT DIDNT END UP ACTUALLY TESTING SORRY
 * @author James
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of createDeck method, of class Deck.
     */
    @Test
    public void testCreateDeck() {
        System.out.println("createDeck");
        Deck instance = new Deck();
        instance.createDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardCount method, of class Deck.
     */
    @Test
    public void testGetCardCount() {
        System.out.println("getCardCount");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.getCardCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealCard method, of class Deck.
     */
    @Test
    public void testDealCard() {
        System.out.println("dealCard");
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.dealCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
