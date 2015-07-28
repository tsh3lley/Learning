import java.util.*;

//   Given input of board dimensions and which color pieces the player wants to go next, 
//   finds coordinates which will maximize number of pieces captured

public class GoGame {

	public int[] findBestCoordinates(int[][]board, int bOrW){
		int[] coordinates = new int[2];
		
		return coordinates;
	}
	
	public static int[][] createBoard(int x, int y, char[] layout){
		int[][] board = new int[x][y];
		for (int i=0;i<y;i++){
			for (int j=0;j<x;j++){
				if (layout[convertCoordinatesToIndex(j,i,x,y)] == ' '){
					board[j][i] = -1;
				}
				else if (layout[convertCoordinatesToIndex(j,i,x,y)] == 'b'){
					board[j][i] = 0;
				}
				else if (layout[convertCoordinatesToIndex(j,i,x,y)] == 'w'){
					board[j][i] = 1;
				}
			}
		}
		return board;
	}
	
	public static int bOrW(char bwChar){
		int bwInt = -1;
		if (bwChar == 'b'){
			bwInt = 0;
		}
		else if (bwChar == 'w'){
			bwInt = 1;
		}
		return bwInt;
	}
	
	public static String printArray(int[] unsorted){
		String sorted = "[";
		for (int i=0;i<unsorted.length;i++){
			sorted = sorted + unsorted[i];
			if (i == unsorted.length - 1){
				sorted = sorted + "]";
			}
			else{
				sorted = sorted + ", ";
			}
		}
		return sorted;
	}
	
	public static String printBoard(int[][] board){
		//used for testing the createBoard method
		String boardString = "";
		for(int i = 0; i < board[0].length; i++){
		    for(int j = 0; j < board.length; j++){
		        System.out.print(board[j][i]);
		        if(j < board[i].length - 1) System.out.print(" ");
		    }
		    System.out.println();
		}
		return boardString;
	}
	
	public int[] convertIndexToCoordinates(int index, int x, int y){
		int coordinates[] = new int[2];
		int counter = 0;
		for(int i = 0; i < y; i++){
		    for(int j = 0; j < x; j++){
		    	if (counter == index){
		    		coordinates[0] = j;
		    		coordinates[1] = i;
		    	}
		        counter++;
		    }
		}
		return coordinates;
	}
	
	public static int convertCoordinatesToIndex(int xCoordinate, int yCoordinate, int xSize, int ySize){
		int index;
		index = (yCoordinate * xSize) + xCoordinate;
		return index;
	}
}
