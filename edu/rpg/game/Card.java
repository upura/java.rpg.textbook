package game;

public class Card {
	private int number;
	private CardType cardType;
	public Card(int number, CardType cardType) {
		this.number = number;
		this.cardType = cardType;
	}

	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public CardType getCardType() {
		return this.cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
}
