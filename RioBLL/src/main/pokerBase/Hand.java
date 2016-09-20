package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Hand {
	ArrayList<Card> getHandCards = new ArrayList<Card>;
	public Hand(){
		for(int i=0, i<5,i++){
			Card drawnCard = Deck.Draw();
			getHandCards.add(drawnCard);
		}
	}

}
