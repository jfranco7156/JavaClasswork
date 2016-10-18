package arrays;

//Side Note: if you want to put different primitive types into an array,
//			you must use the wrapper class


//pass-by-value changes the local variable but does not change the parameter variable itself
public class ArraysPractice {

	static boolean[] boos3;
	public static void main(String[] args) {
		
		//how do you time a process?
		//time is measured in 'long' because it is in milliseconds
		long currentTime = System.currentTimeMillis();
		
		int[] fiftyNumbers = new int[50];
		populate(fiftyNumbers);
		print(fiftyNumbers);
		randomize(fiftyNumbers,100);
		print(fiftyNumbers);
		rollDice(fiftyNumbers,3);
		print(fiftyNumbers);
		//count each die roll and provide a percentage
		countResults(fiftyNumbers,3);
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took "+(endTime-currentTime)+" ms.");
		
	}
	
	private static void countResults(int[] nums, int numOfDice) {
		int[] counter = new int[6*numOfDice];
		for(int n: nums){
			counter[n-1] = counter[n-1]+1;
		}
		for(int i=numOfDice-1; i<counter.length; i++){
			System.out.println((i+1)+" was rolled "+ 100*counter[i]/nums.length + " percent of the time");
		}
	}

	private static void rollDice(int[] nums, int numOfDice) {
		for(int i=0; i<nums.length;i++){
			int dice = 0;
			for(int x=0; x<numOfDice; x++){
				dice = dice + (int)(1+6*Math.random()); 
			}
			nums[i] = dice;
		}
	}

	private static void randomize(int[] nums, int maxNum) {
		for(int i=0; i<nums.length;i++){
			double randNum = Math.random();
			int rand = (int)(randNum*maxNum);
			rand++;
			nums[i] = rand;
		}
	}

	public static void print(int[] nums) {
		for(int i=0; i<nums.length; i++){
			System.out.println("fiftyNumbers["+i+"] = "+nums[i]);
		}
		
	}

	private static void populate(int[] nums) {
		for(int i=0; i<nums.length;i++){
			nums[i] = i+1;
		}
	}

	public static void demonstratePassByValue(){
		//initializingArrayExample();
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		print(someStrings);
	}
	
	private static void makeSpecial(String s) {
		s = "THIS STRING IS SPECIAL!";
	}

	public static void print(String[] s){
		for(int i=0; i<s.length;i++){
			System.out.println(s[i]);
		}
	}
	
	private static void standardPopulate(String[] s) {
//		for(int i=0; i<s.length;i++){
//			s[i] = "String #"+(i+1);
//		}
		int i = 0;
		for(String x: s){
			i++;
			x = "String #"+i;
		}
	}

	public static void initializingArrayExample(){
		//Two different ways to instantiate an array
		boolean[] boos1 = new boolean[3];
		//this can ONLY be done at the declaration b/c it sets size AND content
		boolean[] boos2 = {false,false,false};
		//this does not work:
		//boos3 = {false,true,true};
		//this is all that will work
		boos3 = new boolean[3];
			
		/**2 ways of iterating through an array:
		 * 	STANDARD FOR LOOP
		 * 		- the index is important to keep track of
		 * 		- you need to customize the order
		 */
		for(int i=0; i<boos1.length;i++){
			System.out.println(boos1[i]);
		}
		/**
		 * "FOR - EACH" LOOP
		 * 		- the index is not important
		 * 		- you do not need to customize
		 * 		- automatically assigns a "handle"
		 */
		for(boolean b: boos1){
			System.out.println(b);
		}
		for(boolean b: boos2){
			System.out.println(b);
		}
		
		//OBJECT ARRAYS
		String[] someStrings2 = {"a","b","c"};
		String[] someStrings1 = new String[3];
		//you can do this to instantiate
//		someStrings1[0] = "a";
//		someStrings1[1] = "b";
//		someStrings1[2] = "c";
		//...but it is repetitive
		
		//Let's try a loop to instantiate:
		for(int i=0;i<someStrings1.length; i++){
			someStrings1[i] = "a new String";
		}
		
		for(String s: someStrings1){
			System.out.println(s);
		}
	}

}