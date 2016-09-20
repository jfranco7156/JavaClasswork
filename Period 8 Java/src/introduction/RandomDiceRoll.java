package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		int[] results = new int[6];
		
		//declare variable; logic test; increment
		for(int index=0; index<10; index++){
			int result= rollFairDice();
			System.out.println("Roll # "+(index+1)+": "+rollFairDice()+"  Unfair: "+rollUnfairDice() +"  Result: "+result);
			results[result-1]++;
		}
		
		//print results
		for (int i=0; i<6; i++){
			System.out.println((i+1)+"appeared" + results[i]+" times.");
		}
	}
	
	//return 1,2,3,4,5,6 w/ equal probability
	public static int rollFairDice(){
		double rand = Math.random();//returns a double between 0 and 1; exclusive of 0 and 1
		int roll = (int) (6*rand);//range of numbers[0,5]
		roll++;
		return roll;
	}
	
	public static int rollUnfairDice()
	{
		//Make some numbers appear more than others.
		double rand = Math.random();
		int roll = (int) (rand*2);
		int roll2 = (int) (rand*5);
		int roll3 = roll+roll2;
		roll3++;
		return roll3;
	}

}
