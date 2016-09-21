package introduction;

public class RandomDrawCard {

	public static void main(String[] args) {
		
		String[] deck = {"2","3","4","5","6","7","8","9","Jack","Queen","King","Ace"};
		String[] suit = {"Diamonds","Clubs","Hearts","Spades"};
		
		int drawNum = 10;
		
		for(int num=0; num<drawNum; num++){
			int randDeck = getArrayNum(12);
			int randSuit = getArrayNum(4);
			
			System.out.println("The "+deck[randDeck]+" of "+suit[randSuit]);
		}
		
	}
	
	public static int getArrayNum(int multiplier){
		double rand = Math.random();
		int randNum = (int) (multiplier*rand);
		return randNum;	
	}

}
