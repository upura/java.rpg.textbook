package game;

public class CardController {

	private void addCard(Card[] cards, CardType cardType, int startIndex) {
		int cardsCount = startIndex;
		for (int i = 1; i <= 13; i++) {
			Card card = new Card(i, cardType);
			cards[cardsCount] = card;
			cardsCount++;
		}
	}

	public Card[] createCard() {
		Card[] cards = new Card[52];
		addCard(cards, CardType.HART, 0);
		addCard(cards, CardType.DIA, 13);
		addCard(cards, CardType.SPADE, 26);
		addCard(cards, CardType.CLUB, 39);
		return cards;
	}

}