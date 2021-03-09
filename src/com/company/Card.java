package com.company;

/*This is commited to Github*/

import java.util.Objects;

public class Card {
    private Rank rank;
    private Suit suit;

    Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    private Rank getRank(){
        return rank;
    }

    private Suit getSuit(){
        return suit;
    }

    @Override
    public String toString(){
        return getRank()+ " of "+getSuit();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Card){
            return this.getSuit()==((Card) obj).getSuit() && this.getRank()==((Card) obj).getRank();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int r = rank.getValue();
        int s = suit.getValue();
        return (13*(s-1))+r;
    }
}
