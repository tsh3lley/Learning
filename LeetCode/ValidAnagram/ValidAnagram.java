package ValidAnagram;

import java.util.Arrays;

public class ValidAnagram{

	public static void main(String[] args){
		System.out.println(isAnagram("anagram", "nagaram"));
	}

	public static boolean isAnagram(String s, String t) {
		
        Merge ms = new Merge();
        Merge mt = new Merge();
        
		ms.sort(s.toCharArray());
		mt.sort(t.toCharArray());
		
		if (Arrays.equals(ms.array, mt.array)) return true;
		else return false;
		
	}
}
