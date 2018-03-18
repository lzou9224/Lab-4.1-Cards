
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
	
	public int getPointValue() 
	{
		return pointValue;
	}

	public void setPointValue(int pointValue) 
	{
		this.pointValue = pointValue;
	}

	public String getRank()
	{
		return rank;
	}
	
	public String getSuit()
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
		return "Rank: " + this.getRank() + " Suit: " + this.getSuit() + " Value: " + this.pointValue;
	}

}
