package LeetCoder;

public class ValidAnagram {
	public static void main(String[] args){
		System.out.println(isAnagram("anagram", "nagaram"));
	}
	
	
	public static boolean isAnagram(String s, String t) {
		char[] cS = s.toCharArray();
		char[] cT = t.toCharArray();
		boolean isValid = true;
		
		int[] checkedIndex = new int[s.length()];
		for (int i = 0;i<cS.length;i++){
			for (int j=0;j<cT.length;j++){
				if (cS[i] == cT[j]){
					cT[j] = '!';
				}
			}
		}
		for (int k=0;k<cT.length;k++){
			if (cT[k] != '!'){
				isValid = false;
			}
		}
		return isValid;
	}
}
