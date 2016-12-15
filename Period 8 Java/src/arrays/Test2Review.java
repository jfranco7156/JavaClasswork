package arrays;

public class Test2Review {
	
	private static boolean[][] grid;

	public static void main(String[] args) {
		grid = new boolean[5][5];
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
	}
	
	public static void switchRow(boolean[] row, int x){
		//switch row[x-1], row[x], row[x+1] IF THEY EXIST
		for(int i=-1; i<2; i++){
			if(x+i>=0 && x+i<row.length){
				row[x+i]=!row[x+i];
			}
		}
	}
	
	public static void switchColumn(boolean[][] grid, int r, int c){
		//switch ABOVE and BELOW the value in row r IF THEY EXIST
		switchIfValid(grid,r-1,c);
		switchIfValid(grid,r+1,c);
		
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if(r>=0 && r<grid.length && c>=0 && c<grid[r].length){
			grid[r][c] = !grid[r][c];
		}
	}
	
	public static void buttonClick(int r, int c) {
		if(r>=0 && r<grid.length){//technically correct
			//but not graded
			switchRow(grid[r],c);
		}
		switchColumn(grid,r,c);
		//all above is 1 point, any error = 0 points
		
		//check to see if a single light is on
		
		for(int row=0; r<grid.length; row++){
			for(int col=0; c<grid[r].length; col++){
				if(grid[r][c])return;//1 of 2 points
			}
		}
		System.out.println("You won!");
	}

	public static void printGrid(boolean[][] grid){
//		for(int r=0; r<grid.length; r++){
//			String line = "";
//			for(int c=0; c<grid[r].length; c++){
//				if(grid[r][c]){
//					line+="O ";
//				}
//				else{
//					line+="X ";
//				}
//			}
//			System.out.println(line+"\n");
//		}
		
		for(boolean[] row: grid){
			for(boolean col: row){
				if(col)System.out.print("O");
				else System.out.print("X");
			}
			System.out.println("\n");
		}
		System.out.println("- - - - - - - - - - - - -");
	}
}
