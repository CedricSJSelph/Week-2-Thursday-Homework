
public class PickaCard {
	
	public static void main(String[] args) {
		
		String Suit = "test";
		int generatedSuit;
		
		int Rank = 0;
		String Rank2 = "test";
		
		int generatedRank;
		
		//Random Suit and Random rank
		generatedSuit = (int)(Math.random() * 4) + 1;
		generatedRank = (int)(Math.random() * 13) +1;
		

		//getSuit
		switch((int)(Math.random() * 4) + 1){
			
			case 1:
				Suit = "Hearts";
				break;
				
			case 2:
				Suit = "Spades";
				break;
				
			case 3:
				Suit = "Diomands";
				break;
				
			case 4:
				Suit = "Clubs";
				break;
		}
		
		//getRank
		switch((int)(Math.random() * 13) +1) {
		
			case 1:
				Rank2 = "Ace";
				break;
				
			case 2:
				Rank = 2;
				break;
				
			case 3:
				Rank = 3;
				break;
				
			case 4:
				Rank = 4;
				break;
				
			case 5:
				Rank = 5;
				break;
				
			case 6:
				Rank = 6;
				break;
				
			case 7:
				Rank = 7;
				break;
			
			case 8:
				Rank = 8;
				break;
				
			case 9:
				Rank = 9;
				break;
				
			case 10:
				Rank = 10;
				break;
				
			case 11:
				Rank2 = "Jack";
				break;
				
			case 12:
				Rank2 = "Queen";
				break;
				
			case 13:
				Rank2 = "King";
				break;
				
			default:
				Rank2 = null;
		}
		


		//Rank2 used if string is necessary
		//Section below determines if it needs a String Rank or int rank
		if(Rank2 != "test") {
			
			System.out.println("The card you picked is the " + Rank2 + " of " + Suit);
			
		}else if(Rank2 == "test") {
			
			System.out.println("The card you picked is the " + Rank + " of " + Suit);
			
		}else {
			
			System.out.println("Fatal error");
		}
		
	}

	
}


