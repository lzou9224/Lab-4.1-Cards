//Lingli Zou
//Lab 4.1 Cards
//3/13/2018

public class DeckTester 
{
	
	public static void main(String args[])
	{
		String[] rank= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King"};
		String[] suit= {"Heart", "Spade", "Club", "Diamond"};
		int[] pointValue= { 1,2,3,4,5,6,7,8,9,10,11,12,13 };
		
	
		Deck test1 = new Deck(rank,suit,pointValue);
		test1.shuffle();
		test1.deal();
		
		
	}
}
