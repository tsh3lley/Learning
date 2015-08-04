
public class BitwiseRange {
	public static void main(String args[]){
		System.out.println(rangeBitwiseAnd(0,7)); //4
		System.out.println((5&6)&7);
		
	}
	public static int rangeBitwiseAnd(int m, int n) {
		if (m==0) return 0;
		int total = m;
        for (int i=m+1;i<=n;i++){
        	total &= i;
        }
        return total;
    }
}
