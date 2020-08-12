/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class GoFishTest {
    
    public GoFishTest() {
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
     * Test of play method, of class GoFish.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        GoFish instance = new GoFish();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNumPlayers method, of class GoFish.
     */
    @Test
    public void testFindNumPlayers() {
        System.out.println("findNumPlayers");
        GoFish instance = new GoFish();
        int expResult = 0;
        int result = instance.findNumPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerIDs method, of class GoFish.
     */
    @Test
    public void testSetPlayerIDs() {
        System.out.println("setPlayerIDs");
        ArrayList<Player> tPlayers = null;
        int numPlayers = 0;
        GoFish instance = new GoFish();
        instance.setPlayerIDs(tPlayers, numPlayers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealCards method, of class GoFish.
     */
    @Test
    public void testDealCards() {
        System.out.println("dealCards");
        ArrayList<Player> tPlayers = null;
        Deck deck = null;
        GoFish instance = new GoFish();
        instance.dealCards(tPlayers, deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkEndGame method, of class GoFish.
     */
    @Test
    public void testCheckEndGame() {
        System.out.println("checkEndGame");
        ArrayList<Player> tPlayers = null;
        Deck deck = null;
        GoFish instance = new GoFish();
        Boolean expResult = null;
        Boolean result = instance.checkEndGame(tPlayers, deck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class GoFish.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        ArrayList<Player> tPlayers = null;
        GoFish instance = new GoFish();
        instance.declareWinner(tPlayers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLeaderboards method, of class GoFish.
     */
    @Test
    public void testDisplayLeaderboards() {
        System.out.println("displayLeaderboards");
        ArrayList<Player> tPlayers = null;
        GoFish instance = new GoFish();
        instance.displayLeaderboards(tPlayers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
