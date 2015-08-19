import java.util.Arrays;

public class ArrayDuplicates {
	
	private int[] array;
	private int[] tempMergArr;
	private int length;
	
	
		public static void main(String[] args){
			int[] tru = new int[]{1,3,4,8,9,6,3,2};
			int[] fal = new int[]{1,3,4,8,9,6,5,2};
			int[] pls = new int[]{3,3};
			System.out.println(containsDuplicate(tru) + " " + containsDuplicate(fal));
			System.out.println(containsDuplicate(pls));

	    }
		
	    
	    public static boolean containsDuplicate(int[] nums) {
	    	if (nums == null || nums.length == 0) return false;
	    	ArrayDuplicates ad = new ArrayDuplicates();
	        ad.sort(nums);
	        System.out.println(ad.array);
	        for (int i=0;i<ad.array.length-1;i++){
	        	if (ad.array[i] == ad.array[i+1]) return true;
	        }
	        return false;
	    }

	    public void sort(int inputArr[]) {
	        this.array = inputArr;
	        this.length = inputArr.length;
	        this.tempMergArr = new int[length];
	        doMergeSort(0, length - 1);
	    }
	    
	    private void doMergeSort(int lowerIndex, int higherIndex) {
	         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	            doMergeSort(lowerIndex, middle);
	            doMergeSort(middle + 1, higherIndex);
	            mergeParts(lowerIndex, middle, higherIndex);
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
}
