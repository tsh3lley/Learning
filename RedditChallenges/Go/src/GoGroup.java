import java.util.*;

public class GoGroup {
	ArrayList groups = new ArrayList();
	int size;
	
	
	public ArrayList findGroups(int[][] board){
		ArrayList groups = new ArrayList();
		
		
		
		return groups;
	}
	
	public int[] connectedTo(int[][] board, int location){
		//Returns array size 4 with the following indices corresponding to the following positions
		//Returns 1 if that index corresponds to a same color piece
		//Returns -1 if that index corresponds to an edge or an opposite colored piece
		//~~~~~
		//~~1~~
		//~0N2~
		//~~3~~
		//~~~~~
		GoGame game = new GoGame();
		int[] locationCoordinates = game.convertIndexToCoordinates(location, board.length, board[0].length);
		int pieceType = board[locationCoordinates[0]][locationCoordinates[1]];
		int[] connectedTo = new int[4];
		int counter = 0;
		
		for (int i=-1;i<2;i+=2){
				if (locationCoordinates[0] + i < 0 || locationCoordinates[0] + i > board.length-1){
					connectedTo[0+counter] = -1;
				} else{
					if (board[locationCoordinates[0]+i][locationCoordinates[1]] == pieceType){
						//connectedTo[1+counter] = game.convertCoordinatesToIndex(locationCoordinates[0]+i, locationCoordinates[1], board.length, board[0].length);
						connectedTo[0+counter] = 1;
					} else{
						connectedTo[0+counter] = -1;
					}
				}
				if (locationCoordinates[1] + i < 0 || locationCoordinates[1] + i > board[0].length-1){
					connectedTo[1+counter] = -1;
				} else{
					if (board[locationCoordinates[0]][locationCoordinates[1]+i] == pieceType){
						//connectedTo[2+counter] = game.convertCoordinatesToIndex(locationCoordinates[0], locationCoordinates[1]+i, board.length, board[0].length);
						connectedTo[1+counter] = 1;
					} else{
						connectedTo[1+counter] = -1;
					}
				}
			counter += 2;
		}
		return connectedTo;
	}
	
	public boolean partOfGroup(int[] connectedTo){
		boolean partOfGroup = false;
		int groupSum = 0;
		
		for (int i=0;i<connectedTo.length;i++){
			groupSum += connectedTo[i];
		}
		if (groupSum > connectedTo.length * -1){
			partOfGroup = true;
		}
		return partOfGroup;
	}
	
	public boolean groupHasLiberties(int board[][], int[] group){
		boolean hasLiberties = false;
		for (int i : group){
			if (partOfGroup(connectedTo(board, i))){
				hasLiberties = true;
			}
		}
		
		
		return hasLiberties;
	}
	
}
