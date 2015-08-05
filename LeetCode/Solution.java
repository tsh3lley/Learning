
public class Solution {
	public int[] array;
	public int[] temp;
	public int length;
	
	public static void main(String[] args) {
		int[] input = new int[] {3,3,4};
		System.out.print(majorityElement(input));
	}
	
    public static int majorityElement(int[] nums) {
    	if (nums.length == 1) return nums[0];
    	Solution s = new Solution();
        s.sort(nums);
        int halfN = (nums.length / 2) + 1;
        int currentElement = s.array[0];
        int majorityElement = s.array[0];
        int counter = 0;
        int majority = 0;
        
        for (int i=0;i<nums.length;i++){
        	if (s.array[i] == currentElement){
        		counter++;
        		if (counter > majority){
        			majority = counter;
        			majorityElement = currentElement;
        		}
        	} else {
        		if (counter > majority){
        			majority = counter;
        			majorityElement = currentElement;
        		}
        		counter = 1;
        		currentElement = s.array[i];	
        	}
        
        }
        return majorityElement;
    }
	
	public  void sort(int[] input){
		this.array = input;
        this.length = input.length;
        this.temp = new int[length];
        mergeSort(0, length - 1);
	}
	
	public void mergeSort(int lowerIndex, int higherIndex){
		if (lowerIndex < higherIndex){
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			mergeSort(lowerIndex,middle);
			mergeSort(middle+1,higherIndex);
			mergeParts(lowerIndex,middle,higherIndex);
		}
	}
	
	public void mergeParts(int lowerIndex, int middle, int higherIndex) {
		 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            temp[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = temp[i];
            k++;
            i++;
        }
 
    }
}
