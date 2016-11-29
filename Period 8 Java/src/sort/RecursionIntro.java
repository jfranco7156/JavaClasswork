package sort;

public class RecursionIntro {
	/*
	 * When is recursion useful?
	 * 	Whenever a problem is based off a 'trivial' case, though sometimes a for loop
	 * 	accomplishes the same thing.
	 * 
	 * How will it be tested?
	 * 	Multiple Choice Only: reading recursive methods;
	 */
	public static void main(String[] args) {
//		System.out.println("Using a for loop");
//		for(int i=0; i<5;i++){
//			System.out.println("Hello World! x"+i);
//		}
//		System.out.println("Without using a for loop");
//		forLoop(5, new Action(){
//			private int value=0;
//			
//			public void act(){
//				System.out.println("Hello World! x"+ value);
//				value++;
//			}
//		});
		
		hanoiSolution(4, "A","B","C");
	}

	private static void forLoop(int i, Action action) {
		if(i<=0){
			return;
		}
		else{
			action.act();
			forLoop(i-1, action);
		}
	}
//	private static int factorial(int x){
////		int answerFor=1;
////		System.out.println("Using a for loop");
////		for(int i=x; i<=0;i--){
////			answerFor= answerFor*i;
////		}
////		return answerFor;
//		
//		int answerFor2=1;
//		System.out.println("Without using a for loop");
//		if(x>1){
//			return x*factorial(x-1);
//		}
//		return answerFor2;
//	}
	
	public static void hanoiSolution(int numberOfDiscs,
			String startPeg,
			String midPeg,
			String endPeg){
		
		if(numberOfDiscs<=1){
			System.out.println("Move "+startPeg+" to "+endPeg);
		}else{
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
}
