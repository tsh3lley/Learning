
public class SwappingCounters {

	public static void main(String[] args) {
		cameron(3);

	}
	
	public static int cameron(int n){
		//naive implementation
		int answer = 0;
		int board[] = new int[(2*n)+1];
		for (int i=0;i<board.length;i++){
			if (i<n) board[i] = 1;
			else if (i==n) board[i] = 0;
			else if (i>n) board[i] = 2;
			System.out.print(board[i]);
		}
		
		return answer; 
	}
	
	public static int solve(int[] board, int n){
		
	}
	
	public static boolean isTriangle(int n){
		int guess = (int) Math.ceil((Math.sqrt(n*2))-0.5);
		
		if ((guess*(guess+1))/2 == n && n != 0) return true;
			else return false;
	}


}
