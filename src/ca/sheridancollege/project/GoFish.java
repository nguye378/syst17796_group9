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
import java.util.ArrayList;

import java.util.Scanner;

public class GoFish extends Game {
    Scanner input = new Scanner(System.in);
    
    public GoFish() {
        super("GoFish");
    }
    @Override
    public void play() {
        Boolean endGame = false;
        
        System.out.println("Hi, welcome to GoFish!"); System.out.println();
        // grab num players to create temp array and set player ids
        int numPlayers = findNumPlayers();
        ArrayList<Player> tempPlayers = new ArrayList<>(numPlayers);
        setPlayerIDs(tempPlayers, numPlayers);
        
        // create deck for the game and shuffle it
        Deck deck = new Deck();
        deck.createDeck(); deck.shuffle();
        // deal 5 cards to each player
        dealCards(tempPlayers, deck);
        System.out.println("\n5 cards have been dealt out to each player!\n");
        System.out.println("--------------Starting GoFish--------------\n");
        
        // game starts now, starts looping players turns
        
        // set turn count
        while (endGame == false) {
            for (Player player : tempPlayers) {
                GoFishPlayer gfPlayer = (GoFishPlayer)player;
                gfPlayer.play(tempPlayers, deck);
                // after each player's turn check to end game
                endGame = checkEndGame(tempPlayers, deck);
                if (endGame == true) break;
                System.out.println();
            }
        }
        
        // ending game code
        System.out.println("The game has ended!\n");
        displayLeaderboards(tempPlayers);
        declareWinner(tempPlayers);
        System.out.println("\nThanks for playing our game!");
           
    }
    
    public int findNumPlayers() {
        int num;
        System.out.println("How many players will be playing today?: ");
        num = input.nextInt();
        while (num < 2 || num > 5) {
            System.out.println("Invalid amount of players! 2 - 5 players only: ");
            num = input.nextInt();
        }
        return num;
    }
    
    public void setPlayerIDs(ArrayList<Player> tPlayers, int numPlayers) {
        System.out.println("The game will register each player's ID in order...");
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Please enter an ID, player" + (i + 1) + ": ");
            String id = input.next();
            tPlayers.add(new GoFishPlayer(id));
        }
    }
    
    public void dealCards(ArrayList<Player> tPlayers, Deck deck) {
        for (Player player: tPlayers) {
            for (int i = 0; i < 5; i ++) {
                if (deck.getCardCount() < 1) break;
                GoFishPlayer gfPlayer = (GoFishPlayer)player;
                gfPlayer.addToHand(deck.dealCard());
            }
        }
    }
    
    public Boolean checkEndGame(ArrayList<Player> tPlayers, Deck deck) {
        // game ends when one player runs out of cards or there are no more cards in the deck
        for (Player player: tPlayers) {
            GoFishPlayer gfPlayer = (GoFishPlayer)player;
            if (gfPlayer.checkHandCount() == 0) {
                return true;
            }
        }
        if (deck.getCardCount() == 0) return true;
        return false;
    }
    
    @Override
    // didn't end up finishing
    public void declareWinner(ArrayList<Player> tPlayers) {
        
        Player leader = tPlayers.get(0);
        
        GoFishPlayer gfLeader = (GoFishPlayer)leader;
        for (Player player : tPlayers) {
            GoFishPlayer gfPlayer = (GoFishPlayer)player;
            if (gfPlayer.getScore() > gfLeader.getScore()) {
                leader = gfPlayer;
            }
        }
      
    }
    
    
    public void displayLeaderboards(ArrayList<Player> tPlayers) {
        System.out.println("Leaderboards\n----------------------------------");
        for (Player player : tPlayers) {
            GoFishPlayer gfPlayer = (GoFishPlayer)player;
            System.out.println("ID: " + gfPlayer.getPlayerID() + "   |   Score: " + gfPlayer.getScore());
        }
    }
}
