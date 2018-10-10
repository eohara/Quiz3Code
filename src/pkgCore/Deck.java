package pkgCore;

import pkgEnum.*; 

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck = new ArrayList<Card>(1);

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank, iCardNbr++));
			}
		}
		
		Collections.shuffle(cardsInDeck);
	}

	public ArrayList<Card> getCardsInDeck() {
		return cardsInDeck;
	}

	public void setCardsInDeck(ArrayList<Card> cardsInDeck) {
		this.cardsInDeck = cardsInDeck;
	}

	public Card Draw() throws DeckException {

		if (cardsInDeck.size() == 0)
		{
			throw new DeckException(this);
		}
		return cardsInDeck.remove(0);

	}

	public Card Draw(eSuit eSuit) {
		for (Card c : cardsInDeck) {
			if (c.geteSuit() == eSuit) {
				cardsInDeck.remove(c);
				return (c);
			}
		}
		return (null);
	}

	public int getiDeckCount()
	{
		return cardsInDeck.size();
	}
	
	public int getRemaining(Object eNum) {
	//start at 0	
		int cardsRemaining = 0;
		//iterate through full deck
			for (int i = 0; i < cardsInDeck.size() - 1; i++)
			//if instance of eSuit add to cardsRemaining	
				if (eNum instanceof eSuit) {
					
					if (cardsInDeck.get(i).geteSuit() == eNum)
						cardsRemaining++;
				} 
				//if in eRank, add to cardsRemaining
				else { 
					
					if (cardsInDeck.get(i).geteRank() == eNum)
						cardsRemaining++;
					
				} return cardsRemaining; 
	}
	
	
		
	}
