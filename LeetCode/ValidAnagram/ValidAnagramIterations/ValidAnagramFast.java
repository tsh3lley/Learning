package LeetCoder;

public class ValidAnagramFast {
	public static void main(String[] args){
		System.out.println(isAnagram("anagram", "nagaram"));
		
	}
	
	
	public static boolean isAnagram(String s, String t) {
		char[] cS = sort(s.toCharArray());
		char[] cT = sort(t.toCharArray());
		if (cS == cT) return true;
		else return false;
	}
	
	public static char[] sort(char[] list){
		boolean done = false;
		char storage;
		
		while (done == false){
			done = true;
			for (int i=1;i<list.length;i++){
				if (list[i]<list[i-1]){
					storage=list[i];
					list[i]=list[i-1];
					list[i-1]=storage;
					done = false;
				}
			}
					
		}
		return list;
	}
}
