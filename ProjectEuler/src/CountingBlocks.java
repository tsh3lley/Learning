
public class CountingBlocks {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		int boardSize = 50;
		long arr[] = new long[boardSize + 2];
		arr[0] = 1;
		for (int i = 0; i <= boardSize; i++) {
			arr[i + 1] += arr[i];
			for (int j = i + 4; j <= boardSize + 1; j++) {
				arr[j] += arr[i];
			}
		}
		
		System.out.println("Answer: " + arr[boardSize + 1]);
		long endTime = System.nanoTime();
		System.out.printf("Total Time: " + ((endTime - startTime) / 1000000.0) + " milliseconds\n");
				
	}
}
