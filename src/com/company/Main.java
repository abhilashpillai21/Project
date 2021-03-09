package com.company;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card1 = deck.draw();
        Card card2 = deck.draw();

        System.out.println(card1.toString());
        System.out.println(card2.toString());

        Card winningCard = card1.hashCode()>card2.hashCode()? card1 : card2;

        System.out.println(winningCard+ "  wins!!!");
    }
}


