
ArrayList <Card> unDealt;

public class Deck {

	public Deck(String[] ranks, String[] suits, int[] values)
	{
		for(int x=0; x< ranks.length; x++)
		{
			for(int y=0; y< suits.length; y++)
			{
				unDealt.add(new Card(ranks[x], suits[y], values[i]));
			}
		}
	}
}

