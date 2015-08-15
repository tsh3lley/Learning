
public class TriangularNumber {
		public static void main(String[] args) {
		for (int i=0;i<100;i++){
			System.out.println(i + " " + isTriangle(i));
		}
		isTriangle(15);
	}
		
	public static boolean isTriangle(int n){
		int guess = (int) Math.ceil((Math.sqrt(n*2))-0.5);
		
		if ((guess*(guess+1))/2 == n && n != 0) return true;
			else return false;
	}

}
