package ChatBot;

import java.util.Scanner;

public class JenniberMain {

	static String response;
	static boolean inMainLoop;
	static Scanner input;
	static String user;
	//List all ChatBot available after this class
	static ChatBot school;

	public static void main(String[] args) {
		//demonstrateStringMethods();
		createFields();
		//String s1 = " ";
		//String s2 = "a";
		//System.out.println(s1.compareTo(s2));
		promptName();
		promptForeve();
	}

	public static void promptName() {
		print("Enter your name.");
		user = input.nextLine();
		print("Glad to meet you, "+user+". For the rest of time, I will call you "+user+". You may call me: Computer. We should become friends.");

	}

	public static void promptForeve() {
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, "+user+". How are you?");
			response = promptInput();
			//response to how you feel
			if(findKeyword(response, "good", 0)>=0){
				print("That's wonderful. So glad you feel good.");
			}
			//response to liking school
			else if(response.indexOf("school")>=0){
				print("School is great! Tell me about school.");
				//exit this while loop
				inMainLoop = false;
				//go to school's talk method
				school.talk();
			}
			else{
				print("I don't understand.");
			}
		}
	}

	public static int findKeyword(String searchString, String keyword, int startPsn) {
		//delete the white space on the outside
		searchString = searchString.trim();
		//makes letter lower case
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		int psn = searchString.indexOf(0);
		
		//keep searching until context keyword is found
		while(psn>=0){
			//Assume preceded and followed by space
			String before = " ";
			String after = " ";
			//check character in front, if it exists
			if(psn>0){
				before = searchString.substring(psn-1, psn);
			}
			//check if there is a character after the keyword
			if(psn+keyword.length() < searchString.length()){
				after = searchString.substring(psn+keyword.length(), psn+keyword.length()+1);
			}
			if(before.compareTo("a")<0 && after.compareTo("a")<0){
				return psn;
			}else{
				//psn+1 is one space after our current psn, so this finds the NEXT word.
				psn=searchString.indexOf(keyword,psn+1);
			}
		}
		
		//keyword is not found
		return -1;
	}

	
	
	public static String promptInput() {
		String userInput = input.nextLine();
		return userInput;

	}

	public static void createFields(){
		input = new Scanner(System.in);
		user = "";
		school = new JenniberSchool();
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
}