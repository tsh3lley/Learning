//  TODO Program takes far too long to run

//	A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
//	A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
//	As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
//	Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
import java.util.*;

public class SumOfAbundants
{
	public static void main( String[] args )
	{
		ArrayList integers = new ArrayList();
		int a,b,c,d,sum,increment;
		boolean canBeWritten;
		b = 1;
		d = 0;
		sum = 0;

		for (a=0;a<28123;a++){
			if (isAbundant(a) == true){
				integers.add(new Integer(a));	
			}
		}
		
		int numFalse = 0;
		int numDiff = 0;
		int temp = 0;
		
		while (b<28124){
			canBeWritten = false;
			for (c=0;c<(integers.size());c++){
				for (d=0;d<(integers.size());d++){
					if ((int)integers.get(c) + (int)integers.get(d) == b ){
						canBeWritten = true;
					}
					
				}
			}
			if (canBeWritten == false){
				sum = sum + b;
			}
			b++;
		}
		System.out.println(sum);
	}
	
	public static int sumDivisors(int number){
		int answer = 0;
	    for (int i = 1; i <= (number / 2); i++) {
	    	if (number % i == 0) {
	    		answer = answer + i;
	            }
	        }
		return answer;
	}
	
	public static boolean isAbundant(int number){
		boolean cameron = false;
		if (sumDivisors(number) > number){
			cameron = true;
		}	
		return cameron;
	}
}