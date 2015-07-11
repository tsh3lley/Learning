//  TODO:how to return an array from a function??? thanks chinese bing
//  TODO:get VPN
//		Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
//
//			1634 = 1^4 + 6^4 + 3^4 + 4^4
//			8208 = 8^4 + 2^4 + 0^4 + 8^4
//			9474 = 9^4 + 4^4 + 7^4 + 4^4
//			As 1 = 1^4 is not a sum it is not included.
//
//			The sum of these numbers is 1634 + 8208 + 9474 = 19316.
//
//			Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

public class DigitFifthPowers {
	public static void main(String[] args) {
		int a;
		a = 1234;
		int length = (int)(Math.log10(a)+1);
		for (int i=0;i<length;i++){
		System.out.println(getDigits(a));
		}
//		while (a<100000){
//			getDigits(a);
//		}
	}
	
	public static int[] getDigits(int num){
//		 int[] digit = {1,2,3,4};
		 int length = (int)(Math.log10(num)+1);
		 int digit[] = new int[length];
		 int counter = 0;
	     while(num > 0){
	          digit[counter] = num % 10;
	          num = num / 10;
	          counter ++;
	     }
	     return digit;
	}
}
