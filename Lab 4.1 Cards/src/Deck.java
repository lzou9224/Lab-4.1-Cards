import java.util.ArrayList;

public class Deck {
	
	
	private ArrayList<Card> unDealt = new ArrayList<Card> ();
	private ArrayList<Card> Dealt = new ArrayList<Card>();


	//fields:
	private String[] rank;
	private String[] suit;
	private int[] pointValue;


	public Deck(String[] rank, String[] suit, int[] pointValue)
	{
		for(int x=0; x< rank.length; x++)
		{
			for(int y=0; y< suit.length; y++)
			{
				unDealt.add(new Card(rank[x], suit[y], pointValue[x]));
			}
		}
	}
	
	//getters and setters
	public String[] getRanks() 
	{
		return rank;
	}
	
	public void setRanks(String[] ranks) 
	{
		this.rank = ranks;
	}
	
	public String[] getSuits() 
	{
		return suit;
	}
	
	public void setSuits(String[] suits) 
	{
		this.suit = suits;
	}
	
	public int[] getPointValues() 
	{
		return pointValue;
	}
	
	public void setPointValues(int[] pointValues) 
	{
		this.pointValue = pointValues;
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
	
	public Card deal()
	{
		if(unDealt.size()==0)
		{
			return null;
		}
		
		else
		{
			Card firstNum = unDealt.remove(0);
			Dealt.add(firstNum);
			return firstNum;
			
		}
	}
	
	public void shuffle()
	{

		for(int x=0; x< unDealt.size(); x++)
		{		
			int random = (int) Math.random()*x;

			Card temp = unDealt.get(0);	
			unDealt.set(random, temp);
		
		}
	}

}

