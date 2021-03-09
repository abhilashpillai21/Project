package com.company;

enum Suit {
    SPADES(4), HEARTS(3), CLUBS(2), DIAMONDS(1);

    private int value;

    Suit(int value){
        this.value = value;
    }

    int getValue(){
        return this.value;
    }

}


