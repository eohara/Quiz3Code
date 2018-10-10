package pkgCore;

import static org.junit.Assert.*;

import java.util.Collections;

import pkgCore.Card;
import pkgEnum.eSuit;
import pkgEnum.eRank;
import pkgException.DeckException;

import org.junit.Test;


public class Quiz3_Test {

	@Test
	public void DeckTest() throws DeckException {
		Deck d = new Deck();
		for (Card c: d.getCardsInDeck());
		
		Collections.sort(d.getCardsInDeck());
		System.out.println(d.getCardsInDeck().size());
		
	}
	
	@Test
	public void getRemainingTest_1() throws DeckException {
		Deck d = new Deck();
		
		System.out.println(d.getRemaining(eRank.TWO));
	
	}
	
	@Test
	public void getRemainingTest_2() throws DeckException {
		
		Deck d = new Deck();
		
		System.out.println(d.getRemaining(eSuit.CLUBS));
		
		

	}



}
