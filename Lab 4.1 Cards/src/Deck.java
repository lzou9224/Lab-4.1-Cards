import java.util.ArrayList;

public class Deck {
	
	ArrayList<Card> unDealt;
	ArrayList<Card> dealt;
	
	
	this.Dealt = new ArrayList<Card>();
	this.unDealt = new ArrayList<Card>();
	
	//fields:
	private String[] ranks;
	private String[] suits;
	private int[] pointValues;

	public Deck(String[] ranks, String[] suits, int[] pointValues)
	{
		for(int x=0; x< ranks.length; x++)
		{
			for(int y=0; y< suits.length; y++)
			{
				unDealt.add(new Card(ranks[x], suits[y], pointValues[x]));
			}
		}
	}
	
	//getters and setters
	public String[] getRanks() 
	{
		return ranks;
	}
	
	public void setRanks(String[] ranks) 
	{
		this.ranks = ranks;
	}
	
	public String[] getSuits() 
	{
		return suits;
	}
	
	public void setSuits(String[] suits) 
	{
		this.suits = suits;
	}
	
	public int[] getPointValues() 
	{
		return pointValues;
	}
	
	public void setPointValues(int[] pointValues) 
	{
		this.pointValues = pointValues;
	}
	
	//---------------------------------------------
	
	public boolean isEmpty()
	{
		if(unDealt.size()==0)
		{
			return true;	
			//return true when size of deck is 0
		}
		
		else
		{
			return false;
		}
	}
	
	public int size()
	{
		return unDealt.size();
	}
	
	public int deal()
	{
		if(unDealt.size()==0)
		{
			return null;
		}
		
		else
		{
			return unDealt.remove(random);
		}
	}
	
	public shuffle()
	{
		Math.random
	}
	

}

