package caveExplorer;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		String[] xox = {"x","o","x","o","x"};
		System.out.println(Arrays.toString(xox));
		//a 1D array prints a horizontal string
		
		String[][] arr2D = new String[5][4];
		for(int row=0; row<arr2D.length; row++){
			//put an entire array into each row
			String[] rowContent = new String[arr2D[0].length];
			System.out
			//populate with coordinates
			for(int col=0; col<arr2D[row].length; col++){
				arr2D[row][col] = "("+row+", "+col+")";
			}
		}
		
		//print the 2D array
		//Every element in a 2D Array IS itself an array, so for-each loop looks like this:
		for(String[] row: arr2D){
			System.out.println(Arrays.toString(row));
		}
	}
}
