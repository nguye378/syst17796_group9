/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.CardType.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author James
 */
public class GoFishPlayer extends Player implements CardType {
    private int score;
    private Hand hand; 
    
    public GoFishPlayer(String playerID) {
        super(playerID);
        this.score = 0;
        this.hand = new Hand();
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    public void addToHand(Card card) {
        this.hand.addCard(card);
    }
    public void showHand() {
        System.out.println("These are the cards on your hand:");
        System.out.println(this.hand.showCards());
    }
    public int checkHandCount() {
        return this.hand.returnSize();
    }
    
    
    @Override
    public void play(ArrayList<Player> tPlayers, Deck deck) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Current player's turn: " + this.getPlayerID());
        System.out.println("Score: " + this.getScore());
        System.out.println("-----------------------");
        
        Boolean turnEnd = false;
        while (!turnEnd) { 
            System.out.println("Your deck: ");
            this.hand.displayCardsList();
            playerListMenu(tPlayers, this);

        // loop to ensure valid ID inputted
            Boolean validID = false;
            System.out.print("Choose: ");
            String playerChosen = input.next();
            validID = checkValidID(tPlayers, playerChosen); 
            while (!validID) {
                System.out.println("ERROR! Input the playerID correctly from the list!");
                System.out.print("Choose: ");
                playerChosen = input.next();
                validID = checkValidID(tPlayers, playerChosen); 
            }

            System.out.println("-----------------------");
            System.out.println("Now select a rank to ask for from: " + playerChosen);
            ArrayList<Value> ranks = getPlayersRanks();
            int ind1 = 0;
            String [] stringRanks = new String[52];
            for (Value value : ranks) {
                System.out.println((ind1 + 1) + " : " + value); 
                stringRanks[ind1] = value.name();
                ind1 ++;
            }
            System.out.print("Choose: ");
            String rankString = input.next().toUpperCase();
            Value rankChosen;
            while (!Arrays.asList(stringRanks).contains(rankString)) {
                System.out.println("You can only ask for a rank you have!: ");
                rankString = input.next().toUpperCase();
            }
            rankChosen = Value.valueOf((rankString).toUpperCase());
            System.out.println(playerChosen + ", give me your " + rankString.toLowerCase() + "s.");
            ArrayList<Card> cardsTaken = searchRank(tPlayers, playerChosen, rankChosen);
            System.out.println("-----------------------");
            if (cardsTaken.size() > 0) {
                System.out.println("The cards have been taken.");
                System.out.println(this.getPlayerID() + "'s turn will continue!");
                for (Card card: cardsTaken) { 
                    this.hand.addCard(card);
                }
            }
            else {
                System.out.println("Go Fish! " + this.getPlayerID() + " will draw a card.");
                this.addToHand(deck.dealCard());
                this.checkScore();
                System.out.println("End of turn score: " + this.getScore());
                turnEnd = true;
            }
        }
        System.out.println("Next player's turn!\n\n");
        // while loop ends
    
    }
    
    @Override
    public void playerListMenu(ArrayList<Player> tPlayers, Player currPlayer) {
        System.out.println("-----------------------");
        System.out.println("Select a player by their ID: ");
        int index = 1;
        for (Player player: tPlayers) {
            GoFishPlayer gfPlayer = (GoFishPlayer)player;
            if (!gfPlayer.getPlayerID().equals(currPlayer.getPlayerID())) {
                System.out.println(index + " : " + gfPlayer.getPlayerID());
                index ++;
            }
        }
    }
    
    @Override
    // makes sure player calls a valid ID
    public Boolean checkValidID(ArrayList<Player> tPlayers, String playerID) {
        for (Player player: tPlayers) {
            if (playerID.equals(player.getPlayerID()) && (!playerID.equals(this.getPlayerID()))) return true;
        }
        return false;
    }
    
    public ArrayList<Value> getPlayersRanks() {
        ArrayList<CardType.Value> ranks = new ArrayList<>();
        for (Card card : this.hand.showCards()) {
            if (!ranks.contains(card.getValue())) {
                ranks.add(card.getValue());
            }
        }
        return ranks;
    }
    
    public ArrayList<Card> searchRank(ArrayList<Player> tPlayers, String playerChosen, Value rank) { 
        ArrayList<Card> takenCards = new ArrayList<>();
        for (Player player : tPlayers) {
            GoFishPlayer gfPlayer = (GoFishPlayer)player;
            if (gfPlayer.getPlayerID().equals(playerChosen)) {
                for (Card card: gfPlayer.hand.showCards()) {
                    if (card.getValue() == rank) {
                        takenCards.add(card);
                    }
                }
            gfPlayer.hand.showCards().removeAll(takenCards);
            }
        }
        return takenCards;
        
    }
    
    public void checkScore () {
        for (Value v: Value.values()) {
            ArrayList<Card> books = new ArrayList<>();
            for (Card card : this.hand.showCards()) {
                if (card.getValue().equals(v)) {
                    books.add(card);
                }
            }
            if (books.size() == 4) {
                System.out.println(this.getPlayerID() + "");
                this.hand.showCards().removeAll(books);
                this.score ++;
            }
        }
    }
}
