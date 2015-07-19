public class PrimeFactors {

	public static void main(String[] args) {
//		The prime factors of 13195 are 5, 7, 13 and 29.
//		What is the largest prime factor of the number 600851475143 ?
		long ans = 0;
		long bignum = 600851475143L;
		for (long i = 3; i <= Math.ceil(Math.sqrt(bignum)); i++){
			if (isPrime(i)){
				if (bignum%i == 0){
					ans = i;
				}
			}
		}
		System.out.print(ans);
	}
	
	public static boolean isPrime(long n){
		if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    long sqrtN = (long)Math.sqrt(n)+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
		return true;
	}

}
