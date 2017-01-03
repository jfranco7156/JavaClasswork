package caveExplorer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Connect4 {

//	
//	public static Scanner in = new Scanner(System.in);
//	static String[][] arr2D;
//	static String[][] pic;
//	static int starti;
//	static int startj;
//	static int treasurei;
//	static int treasurej;
//	public static void main(String[] args) {
//		pic = new String[7][8];
//		pic = createGrid(pic);
//		//printPic(pic);
//		
//		startExploring();
//		
//	}
//	
//	private static String[][] createGrid(String[][] grid) {
//		for(int r=0; r< grid.length; r++){
//			int count = 0;
//			for(int c=0; c<grid[r].length; c++){
//				
//				if(r==0){
//					grid[r][c] = "" + count;
//					count++;
//				}
//				else{
//					grid[r][c] = " ";
//				}
//			}
//		}
//		return grid;
//	}
//	
////	private static void promptUser(){
////		System.out.println("Which column do you want to drop your piece?");
////		input = in.nextLine();
////		int number = Integer.parseInt(input);
////		
////	}
//	private static boolean isValid(String input) {
//		String[] validKeys = {"0", "1", "2", "3", "4", "5", "6", "7"};
//		for(String key: validKeys){
//			if(input.toLowerCase().equals(key)){
//				return true;
//			}
//		}
//		
//		return false;
//	}
//	
//	private static int[] interpretInput(String input) {
//		//verify input is valid
//		while(!isValid(input)){
//			System.out.println("Sorry, in this game, you can only use the numbers 0 to 7.");
//			System.out.println("Tell me again what you would like to do?"); 
//			
//			input=in.nextLine();
//		}
//		int currentC = Integer.parseInt(input);
//		
//		for(int r=pic.length-1; r<=0; r--){
//			if(!pic[r][currentC].equals("O")){
//				pic[r][currentC] = "O";
//			}
//			if(r==0 && pic[r][currentC].equals("O")){
//				System.out.println("Sorry that column is full. Please choose another column");
//			}
//		}
//
//		int[] newCoordinates = {starti, startj};
//		if(currenti>=0 && currenti<arr2D.length && currentj>=0 && currentj<arr2D[0].length){
//			newCoordinates[0] = currenti;
//			newCoordinates[1] = currentj;	
//		}
//		else{
//			System.out.println("Sorry, you've reached the edge of the known universe."
//					+ "You may go no farther in that direction");
//		}
//		
//		return newCoordinates;
//	}
//	
//	private static void startExploring() {
//		while(true){
//			printPic(pic);
//			
//			System.out.println("Which column do you want to drop your piece?");
//			String input = in.nextLine();
//			
//			int[] newCoordinates = interpretInput(input);
//			starti = newCoordinates[0];
//			startj = newCoordinates[1];
//		}
//	}
//	
//	private static void printPic(String[][] pic) {
//		for(String[] row:pic){
//			for(String col:row){
//				System.out.print(col);
//			}
//			System.out.println();
//		}
//	}
}

