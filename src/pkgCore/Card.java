package pkgCore;

import java.util.Comparator;

import pkgEnum.*;

public class Card implements Comparable {

	private eSuit eSuit;
	private eRank eRank;
	private int iCardNbr;

	public Card(pkgEnum.eSuit eSuit, pkgEnum.eRank eRank, int iCardNbr) {
		super();
		this.eSuit = eSuit;
		this.eRank = eRank;
		this.iCardNbr = iCardNbr;
	}

	public eRank geteRank() {
		return eRank;
	}

	public eSuit geteSuit() {
		return eSuit;
	}

	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
		
	}

	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}

	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;		
		int i = this.geteSuit().compareTo(c.geteSuit());
		if (i != 0) 
			return i;
		
		i = this.geteRank().compareTo(c.geteRank());
		return i;
	}
	
	
	public static Comparator<Card> CardRank = new Comparator<Card>() {
		
		public int compare(Card c1, Card c2)
		{
			return c1.getiCardNbr() -  c2.getiCardNbr();
		}
	};

	protected int getiCardNbr() {
		
		return 0;
	}
}