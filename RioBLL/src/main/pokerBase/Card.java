package pokerBase;
public class Card {
	private int iCardNbr;
	private int iCardRnk;
	private int iCardSuit;
	public Card(int cardNbr, int cardRnk , int cardSuit){
		this.iCardNbr = cardNbr;
		this.iCardRnk = cardRnk;
		this.iCardSuit = cardSuit;
	}
	public int getiCardNbr(){
		return this.iCardNbr;
	}
	public int getiCardRnk(){
		return this.iCardRnk;
	}
	public int getCardSuit(){
		return this.iCardSuit;
	}

	
	
	
	
}
