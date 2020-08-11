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
public class GoFishPlayerTest {
    
    public GoFishPlayerTest() {
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
     * Test of getScore method, of class GoFishPlayer.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        GoFishPlayer instance = null;
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScore method, of class GoFishPlayer.
     */
    @Test
    public void testSetScore() {
        System.out.println("setScore");
        int score = 0;
        GoFishPlayer instance = null;
        instance.setScore(score);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToHand method, of class GoFishPlayer.
     */
    @Test
    public void testAddToHand() {
        System.out.println("addToHand");
        Card card = null;
        GoFishPlayer instance = null;
        instance.addToHand(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showHand method, of class GoFishPlayer.
     */
    @Test
    public void testShowHand() {
        System.out.println("showHand");
        GoFishPlayer instance = null;
        instance.showHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkHandCount method, of class GoFishPlayer.
     */
    @Test
    public void testCheckHandCount() {
        System.out.println("checkHandCount");
        GoFishPlayer instance = null;
        int expResult = 0;
        int result = instance.checkHandCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class GoFishPlayer.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        ArrayList<Player> tPlayers = null;
        Deck deck = null;
        GoFishPlayer instance = null;
        instance.play(tPlayers, deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerListMenu method, of class GoFishPlayer.
     */
    @Test
    public void testPlayerListMenu() {
        System.out.println("playerListMenu");
        ArrayList<Player> tPlayers = null;
        Player currPlayer = null;
        GoFishPlayer instance = null;
        instance.playerListMenu(tPlayers, currPlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkValidID method, of class GoFishPlayer.
     */
    @Test
    public void testCheckValidID() {
        System.out.println("checkValidID");
        ArrayList<Player> tPlayers = null;
        String playerID = "";
        GoFishPlayer instance = null;
        Boolean expResult = null;
        Boolean result = instance.checkValidID(tPlayers, playerID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayersRanks method, of class GoFishPlayer.
     */
    @Test
    public void testGetPlayersRanks() {
        System.out.println("getPlayersRanks");
        GoFishPlayer instance = null;
        ArrayList<CardType.Value> expResult = null;
        ArrayList<CardType.Value> result = instance.getPlayersRanks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchRank method, of class GoFishPlayer.
     */
    @Test
    public void testSearchRank() {
        System.out.println("searchRank");
        ArrayList<Player> tPlayers = null;
        String playerChosen = "";
        CardType.Value rank = null;
        GoFishPlayer instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.searchRank(tPlayers, playerChosen, rank);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkScore method, of class GoFishPlayer.
     */
    @Test
    public void testCheckScore() {
        System.out.println("checkScore");
        GoFishPlayer instance = null;
        instance.checkScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
