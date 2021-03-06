package pokerBase;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Deck {
	ArrayList<Card> getDeckCards = new ArrayList<Card>();

	public Deck(){
		int cardRnk;
		int cardSuit;
		int cardNbr = 1;
		for (cardSuit = 0; cardSuit < 4; cardSuit++){
			for (cardRnk = 0; cardRnk < 13; cardRnk++){
				getDeckCards.add(cardRnk,cardSuit,cardNbr);
				cardNbr++;
			}	
		}
		Collections.shuffle(getDeckCards);
	}
	public Card Draw() {
		return getDeckCards.remove(0);
	}
	private int getDeckSize(){
		return getDeckCards.size();
	}
}