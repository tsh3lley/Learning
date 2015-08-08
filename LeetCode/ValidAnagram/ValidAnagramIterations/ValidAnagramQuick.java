package LeetCoder;

import java.util.Arrays;

/* leetcoder problem #242
 * If you are a recruiter looking at this code via github, please forgive this hilarious mess
 * I was running out of time while racing my friend to complete this and I was allowed to use my other files
 * I decided to use my old merge sort class because I didnt want to jeopardize my rights to the good pool cue for the whole day
 * I have since fixed this mess
 * If you hire me I promise to never let something like this end up in production code
 */

public class ValidAnagramQuick {
	
	private char[] array;
	private char[] array2;
	private char[] tempMergArr;
	private char[] tempMergArr2;
	private int length;
	
	
		public static void main(String[] args)
		{
			System.out.println(isAnagram("anagram", "nagaram"));

	    }

	    public void sort(char inputArr[]) {
	        this.array = inputArr;
	        this.length = inputArr.length;
	        this.tempMergArr = new char[length];
	        doMergeSort(0, length - 1);
	    }
	    
	    public void sort2(char inputArr[]) {
	        this.array2 = inputArr;
	        this.length = inputArr.length;
	        this.tempMergArr2 = new char[length];
	        doMergeSort2(0, length - 1);
	    }
	 
	    private void doMergeSort(int lowerIndex, int higherIndex) {
	         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	            doMergeSort(lowerIndex, middle);
	            doMergeSort(middle + 1, higherIndex);
	            mergeParts(lowerIndex, middle, higherIndex);
	        }
	    }
	    
	    private void doMergeSort2(int lowerIndex, int higherIndex) {
	         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	            doMergeSort2(lowerIndex, middle);
	            doMergeSort2(middle + 1, higherIndex);
	            mergeParts2(lowerIndex, middle, higherIndex);
	        }
	    }
	 
	    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
	 
	        for (int i = lowerIndex; i <= higherIndex; i++) {
	            tempMergArr[i] = array[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (tempMergArr[i] <= tempMergArr[j]) {
	                array[k] = tempMergArr[i];
	                i++;
	            } else {
	                array[k] = tempMergArr[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            array[k] = tempMergArr[i];
	            k++;
	            i++;
	        }
	 
	    }
	    
	    private void mergeParts2(int lowerIndex, int middle, int higherIndex) {
	   	 
	        for (int i = lowerIndex; i <= higherIndex; i++) {
	            tempMergArr2[i] = array2[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (tempMergArr2[i] <= tempMergArr2[j]) {
	                array2[k] = tempMergArr2[i];
	                i++;
	            } else {
	                array2[k] = tempMergArr2[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            array2[k] = tempMergArr2[i];
	            k++;
	            i++;
	        }
	 
	    }
	
	public static boolean isAnagram(String s, String t) {
        ValidAnagramQuick ms = new ValidAnagramQuick();
		ms.sort(s.toCharArray());
		ms.sort2(t.toCharArray());
		if (Arrays.equals(ms.array, ms.array2)) return true;
		else return false;
	}
	

}
