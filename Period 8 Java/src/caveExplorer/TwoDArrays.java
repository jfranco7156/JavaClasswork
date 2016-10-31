package caveExplorer;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		String[] xox = {"x","o","x","o","x"};
		System.out.println(Arrays.toString(xox));
		//a 1D array prints a horizontal string
		
		String[][] arr2D = new String[5][4];
		System.out.println("The height is "+ arr2D.length);
		System.out.println("The width is "+arr2D[0].length);
		
		for(int row=0; row<arr2D.length; row++){
			//put an entire array into each row
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

//Make class call door to check whether door is locked or unlocked.
// if puzzle is solved, door become unlocked
//Make an [] with bordering rooms that contain the rooms surrounding the cells you are at
// if bordering room does not exist, store that value as null
//Make an [] of doors to check whether they are opened or not
//Make an inventory to store treasure, content, bonuses, etc
//Group of six will program how the rooms are connected
// order in which the rooms are connected
