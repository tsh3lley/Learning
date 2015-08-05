
public class ReverseBinary {

	public static void main(String[] args) {
		System.out.println(reverseBinary(43261596));
	}
	
	//010
	//101
	
	public static int reverseBinary(int n){
		int num = 0;
		for (int i=0;i<32;i++){
			num = num + (n&1);
			n = n>>>1;
			if (i < 31){
	            num <<= 1;
			}
		}
		return num;
	}

}
