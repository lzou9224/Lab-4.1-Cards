
public class Card {

	
	//fields:
	private String rank;
	private String suit;
	private int pointValue;
	
	public Card(String ranks, String suits, int pointValue) 
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
	
	
	public String toString();

}
