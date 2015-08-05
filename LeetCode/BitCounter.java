
public class BitCounter {
    // you need to treat n as an unsigned value
	
	public static void main(String[] args){
		System.out.println(hammingWeight(11));
	}
    public static int hammingWeight(int n) {
        int counter = 0;
        while (n!=0){
            counter = counter + (n&1);
            n= n>>>1;
        }
        return counter;
    }
}

