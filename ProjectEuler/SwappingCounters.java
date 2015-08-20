
public class SwappingCounters {
	//M(n)=n(n+2)
	//t(n)=n(n+1)/2
	//n(n+2)=m(m+1)/2
	//8n^2+16n+1 = m^2
	//only check numbers that satisfy this requirement, drastically speeds up answer
	public static void main(String[] args) {
		System.out.print(sum());
	}

	public static long sum(){
		int counter = 0;
		long i = 0;
		long sum = 0;
		while (counter<40){
			if (isTriangle(mn(i))){
				System.out.println(i + ",");
				sum = sum + i;
				//i = i*2;
				counter++;
			}
			i++;
		}
		return sum;
	}
	
	public static long mn(long n){
		return (n*(n+2)); 
	}
	
	public static boolean isTriangle(long n){
		long guess = (long) Math.ceil((Math.sqrt(n*2))-0.5);
		
		if ((guess*(guess+1))/2 == n && n != 0) return true;
			else return false;
	}
	
}
