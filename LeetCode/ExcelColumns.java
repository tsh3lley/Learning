
public class ExcelColumns {

	public static void main(String[] args) {
		System.out.println("A " + titleToNumber("A"));
		System.out.println("B " + titleToNumber("B"));
		
		System.out.println("AA " + titleToNumber("AA"));
		System.out.println("BA " + titleToNumber("BA"));
		
//		    A -> 1
//		    B -> 2
//		    C -> 3
//		    ...
//		    Z -> 26
//		    AA -> 27
//		    AB -> 28 
//			BA -> 53
	}
	
	public static int titleToNumber(String s) {
		char[] letters = s.toCharArray();
		int sum = 0;
		int value;
		int power = 0;
		for (int i=letters.length-1;i>=0; i--){
			value = (letters[i] - 64);
	    	sum += value * Math.pow(26, power);
	    	power++;
	    }
	    return sum;
	}

}
