package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck{
    private int numberOfCards = Suit.values().length * Rank.values().length;
    private static List<Card> cards = new ArrayList<>();


    Deck(){
        shuffle();
    }

    final void shuffle(){
        for(Rank rank : Rank.values()){
            for(Suit suit : Suit.values()){
                cards.add(new Card(rank, suit));
            }
        }
    }

    protected List<Card> getCardDeck(){
        return cards;
    }

    /*
     * @TODO: Write logic to sort the cards by their value
     */
    public Card draw(){
        if(cards.isEmpty()) {
            System.out.println("Deck is empty");
            return null;
        }
        Card drawnCard = cards.get((int) Math.round(Math.random()*numberOfCards));
        numberOfCards --;
        cards.remove(drawnCard);
        shuffle();
        return drawnCard;
    }

    public void place(Card drawnCard){
        if(cards.contains(drawnCard)){

            return;
        }

        cards.add(drawnCard);
    }

    protected void sortByValue(){
        int suitValue = Suit.values().length;
        int rankValue = Rank.values().length;

        List<Card> temp = new ArrayList<>();
    }
}
