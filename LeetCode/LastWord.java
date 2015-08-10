
public class LastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("     "));
	}

	 public static int lengthOfLastWord(String s) {
		 s = s.trim();
		 if (s.isEmpty()) return 0; 
		 char[] lastWord;
		 if(s.contains(" ")){
			 String[] words = s.split(" "); 
			 lastWord = words[words.length-1].toCharArray();
		 } else{
			 lastWord = s.toCharArray();
		 }
		 
		 int length = lastWord.length;
		 return length;
	 }
}
