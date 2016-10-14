package arrays;

//Side Note: if you want to put different primitive types into an array,
//			you must use the wrapper class

public class ArraysPractice {

	static boolean[] boos3;
	public static void main(String[] args) {
		
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
		String[] someStrings1 = new String[3];
		String[] someStrings2 = {"a","b","c"};
		
		for(String s: someStrings1){
			System.out.println(s);
		}
		for(String s: someStrings2){
			System.out.println(s);
		}
		
	}

}
