
public class MajorityElementSmart {
	public int[] array;
	public int[] temp;
	public int length;
	
	public static void main(String[] args) {
		int[] input = new int[] {3,3,4,4,4};
		System.out.print(majorityElement(input));
	}
	
    public static int majorityElement(int[] nums) {
    	if (nums.length == 1) return nums[0];
    	MajorityElementSmart s = new MajorityElementSmart();
        s.sort(nums);
        return s.array[s.array.length / 2];
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
