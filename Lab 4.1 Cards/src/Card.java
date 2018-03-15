
public class Card {

	
	//fields:
	private String rank;
	private String suit;
	private int pointValue;
	
	public Card(String rank, String suit, int pointValue) 
	{		
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
		
		
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String getSuits()
	{
		return suit;
	}
	
	public int pointValue()
	{
		return pointValue;
	}
	
	
	@Override
	public String toString()
	{
		return "Rank: " + this.rank + "\t Suits: " + this.suit;
	}

}
