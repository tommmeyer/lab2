package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Hand {
	ArrayList<Card> getHandCards = new ArrayList<Card>;
	private Hand(){
		for(int i=0, i<5,i++){
			Card drawnCard = Deck.Draw();
			getHandCards.add(drawnCard);
		}
	collections.sort(getHandCards);
	}
	private static boolean isHandFlush(ArrayList<Card>) {
		ArrayList<int> cardSuit = new ArrayList<int>
		for (Card: getHandCards){
			int cardSuits = Card.getiCardSuit(Card);
			cardSuit.add(cardSuits)
		}
		Collections.sort(cardSuit);
		if cardSuit
		
		boolean bIsFlush = false;
		Card 
		return bIsFlush;
}
