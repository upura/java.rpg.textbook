package game;

import java.util.Random;

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

	public Card[] shuffle(Card[] cards) {
		Card[] results = new Card[52];
		Random random = new Random();
		int index = 0;
		while(index < 52) {
			int rand = random.nextInt(52);
			Card card = cards[rand];
			boolean stillAdd = false;
			for (Card result:results) {
				if (result == null) {
					break;
				}
				if (result.getCardType().equals(card.getCardType())
						&& result.getNumber() == card.getNumber()) {
					stillAdd = true;
					break;
				}
			}
			if (stillAdd) {
				results[index] = card;
				index++;
			}
		}
		return results;
	}
}