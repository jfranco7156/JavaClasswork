package introduction;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;

	public static void main(String[] args) {
		//demonstrateStringMethods();
		createFields();
		promptName();
		promptForever();
	}

	public static void promptName() {
		print("Enter your name.");
		user = input.nextLine();
		print("Glad to meet you, "+user+". For the rest of time, I will call you "+user+". You may call me: Computer. We should become friends.");

	}

	public static void promptForever() {
		while(true){
			promptInput();
		}
	}

	public static void promptInput() {
		print("Please type something "+user+".");
		String userInput = input.nextLine();
		print("Congratulations! You typed: "+userInput);

	}

	public static void createFields(){
		input = new Scanner(System.in);
		user = "";
	}



	public static void demonstrateStringMethods(){
		String text1 = new String("Hello World");
		String text2 = "Hello World";// same as above

		//ALL objects get prepared using the ".equals" method
		if(text1.equals(text2)){
			print("These strings are equal: ");
		}
		print(text1);
		print(text2);

		String word1 = "Aardvark";
		String word2 = "Zyzzyva";

		if(word1.compareTo(word2) < 0){
			print("word1 comes before word2");
		}
	}

	public static void print(String s){
		String printString = "";
		int cutoff = 25;
		//this while loop last as long as there are words left in the original String
		while(s.length() > 0){

			String currentCut = "";
			String nextWord = "";

			//while the current cut is still less than the line length 
			//AND there are still words left to add
			while(currentCut.length()+nextWord.length() < cutoff && s.length() > 0){

				//add the next word
				currentCut += nextWord;

				//remove the word that was added from the original String
				s = s.substring(nextWord.length());

				//identify the following word, exclude the space
				int endOfWord = s.indexOf(" ");

				//if there are no more spaces, this is the last word, so add the whole thing
				if(endOfWord == -1) {
					endOfWord = s.length()-1;//subtract 1 because index of last letter is one less than length
				}

				//the next word should include the space
				nextWord = s.substring(0,endOfWord+1);
			}

			printString +=currentCut+"\n";

		}
		System.out.print(printString);
	}


	/*	
	private static String getCut(String m, int cutoff, int cut){
		int cutIndex = cut*cutoff;
		if(cutIndex>m.length()){
			cutIndex= m.length();
		}

		String currentCut = m.substring(0, cutIndex);

		int indexOfLastSpace = currentCut.length()-1;
		//Start at last index, go backwards
		for(int i = currentCut.length()-1; i>=0; i--){
			String letter = currentCut.substring(i, i+1);
			if(letter.equals(" ")){
				indexOfLastSpace = i;
				break;
			}
		}

		//shorten the cut to end on a space
		currentCut = currentCut.substring(0,indexOfLastSpace);
		return currentCut;
	}
	 */
}