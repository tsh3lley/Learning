
public class TwoSum {

	private int counter = 0;
	
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		System.out.print(ts.isHappy(2));
	}
	
    public boolean isHappy(int n) {
    	System.out.println("n " + n + ".");
    	
    	if (n == 1){
    		return true;
    	}
    	else {
    		counter++;
    		if (counter >= 50) return false;
    		return isHappy(sumSquares(n));
    	}
    }
    
    public int sumSquares(int n){
    	int sum = 0;
    	while (n>=1){
    		sum += Math.pow(n%10, 2);
    		n = n/10;
    	}
    	System.out.println("sum " + sum);
    	return sum;
    }
}
