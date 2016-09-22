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
	
	public static void print(String m){
		String printString = m;
		int cutoff = 45;
		if(printString.length()>cutoff){
			for(int i = 0; i*cutoff<m.length(); i++){
				// append +=
				printString += getCut(m,cutoff, i+1)+"\n";
			}
		}
		
		System.out.println(printString);
	}
	
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

}