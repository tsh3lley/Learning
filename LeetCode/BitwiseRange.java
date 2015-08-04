
public class BitwiseRange {
	public static void main(String args[]){
		System.out.println(rangeBitwiseAnd(6,7)); //4
		System.out.println((5&6)&7);
		
	}
	public static int rangeBitwiseAnd(int m, int n) {
		if (m==0) return 0;
		int r=Integer.MAX_VALUE;
	    while((m&r)!=(n&r))  r=r<<1;
	    return n&r;
    }
}
