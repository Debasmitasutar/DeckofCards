package DeckOfCardProgram;

import java.util.Random;

public class DeckOfCard {
    static String[] Clubs = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
            };

    static String[] Diamonds = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
            };

    static String[] Hearts = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
            };

    static String[] Spades = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
            };

    static String[][] deckNames = {Clubs, Diamonds, Hearts, Spades};
    static String[][] cards;

    public static void main(String[] args) {
        cardDistribution();
    }

    //Function for distribution of cards
    public static void cardDistribution() {
        //assigning cards to decknames
        cards = deckNames;
        for (int i = 1; i < 5; i++) {
            System.out.println("Player" + i+"->");
            for (int j = 1; j < 10; j++) {
                sufflingCard();
            }
            System.out.println("");
        }
    }

    //Function for suffling of cards
    public static void sufflingCard() {
        //Calling Random utility function
        Random c = new Random();
        //Generate random number between 0-3
        int suit = c.nextInt(4);
        //Generate random number between 0-12
        int rank = c.nextInt(13);

        if (cards[suit][rank] == null) {
            //calling suffling card function
            sufflingCard();
        } else {
            System.out.println(cards[suit][rank]);
            cards[suit][rank] = null;
        }
    }
}
