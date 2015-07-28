import java.util.Scanner;


public class PlayGo {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String piecesOnBoardString = "";
		GoGame game = new GoGame();
		GoGroup group = new GoGroup();
		System.out.println("What are the board dimensions?");
		System.out.println("Length? (X)");
		int boardLength = keyboard.nextInt();
		System.out.println("Height? (Y)?");
		int boardHeight = keyboard.nextInt();
		char[] piecesOnBoardCharArray = new char[boardLength * boardHeight];
		System.out.println("Copy and paste the board layout");
		piecesOnBoardString = "bbbbbb bw wwbbbwwwwbwbbbbbbwb wb ww";
		piecesOnBoardCharArray = piecesOnBoardString.toCharArray();
		System.out.println("What color is the player? (b or w?)");
		int blackOrWhite = game.bOrW(keyboard.next().charAt(0));
		System.out.println(game.printBoard(game.createBoard(boardLength,boardHeight,piecesOnBoardCharArray)));
		//System.out.println("Optimum coordinates for next move: " + printArray(findBestCoordinates(boardLength, boardHeight, piecesOnBoard, blackOrWhite)));
		System.out.println("PLSGOD: " + game.printArray(group.connectedTo(game.createBoard(boardLength,boardHeight,piecesOnBoardCharArray),5)));
		
	}
	

}
