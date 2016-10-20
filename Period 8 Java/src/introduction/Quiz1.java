package introduction;

import java.util.Scanner;

public class Quiz1 {

	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	//1 point visibility private
	//1 point for data type declaration - throughout the entire program
	private static String username = "test_user";
	private static String password = "test";
	
	//1 point for correct methods
	public static void main(String[] args){
		//1 point, asking username once. 
		if(correctUser()){
			askPassword();
		}
		else{
			System.out.print("Unknown username, please contact the network administrator.");
		}
	}

	private static boolean correctUser() {
		System.out.println("Enter a username.");
		// 1 point comparing strings
		//Long way
//		if(waitForEntry().equals(username)){
//			return true;
//		}
//		return false;
		
		//shorter way
		return waitForEntry().equals(username);
	}

	private static void askPassword() {
		boolean inLoop = true;
		int triesRemaining = 3;
		while(inLoop){
			System.out.println("Enter your pasword.");
			//1 point using waitForEntry() correctly as a method
			//
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("Correct!");
				inLoop = false;
			}
			else{
				//.5 point if triesRemaining changes
				triesRemaining --;
				if(triesRemaining==0){
					//.5 if printing invalid password
					System.out.println("Invalid Passowrd");
					//.5 if MAX 3 tries
					inLoop = false;
				}
				else{
					//.5 if print CORRECT number of tries
					System.out.println("You have "+triesRemaining+" attempt(s) left.");
				}
			}
		}
		
		
	}
}
