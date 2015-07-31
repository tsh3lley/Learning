import java.util.ArrayList;


public class HyperBinary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1021
		//221
		//1101
		int num = Integer.parseInt(toBinary(13));
		System.out.println(numSolutions(num));
	}

	public static ArrayList<Integer> solve(int n){
		ArrayList<Integer> solutions = new ArrayList<Integer>();
		int num = Integer.parseInt(toBinary(n));
		
		int length = (int) Math.log10(num);

		while (num>=1){
			if (num % 10 != 0){
				numOnes++;
			}
			num = num / 10;
		}
		
		if (binary % 10 != 0){
			numOnes = numOnes - 1; 
		}
		
		//plus one for binary solution
		return numOnes + 1;
		
		
		
		
		
		
		
		return solutions;
	}
	
	
	public static String toBinary(int n){
		
		return Integer.toBinaryString(n);
	}
	
	public static int numSolutions(int binary){
		int numOnes = 0;
		int num = binary;
		int length = (int) Math.log10(binary);

		while (num>=1){
			if (num % 10 != 0){
				numOnes++;
			}
			num = num / 10;
		}
		
		if (binary % 10 != 0){
			numOnes = numOnes - 1; 
		}
		
		//plus one for binary solution
		return numOnes + 1;
	}
}
