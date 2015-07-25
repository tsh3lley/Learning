import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//https://www.reddit.com/r/dailyprogrammer/comments/3ddpms/20150715_challenge_223_intermediate_eel_of_fortune/
public class EelOfFortune {

	public static void main(String[] args) throws IOException {
		ArrayList<String> words = new ArrayList<String>();
        String filename = "C:/Users/Thomas/Documents/GitHub/Learning/Challenges/enable1.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String word = "lskdjaf";
        String line;
        while (word != null) {
            line = reader.readLine();
            if (line == null) {
                break;
            }
            word = "";
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ' ') {
                    word += line.charAt(i);
                }

            }
            words.add(word);
        }
        reader.close();
		System.out.println(problem("synchronized", "snond"));
		System.out.println(problem("misfunctioned", "snond"));
		System.out.println(problem("mispronounced", "snond"));
		System.out.println(problem("shotgunned", "snond"));
		System.out.println(problem("dnons", "snond"));
		System.out.println(count(words,"snond"));
		System.out.println(count(words,"rrizi"));
	}
	public static boolean problem(String secretIn, String cussIn){
		char[] secret = secretIn.toCharArray();
		char[] cuss = cussIn.toCharArray();
		String word = "";
		
		for (int i=0;i<secret.length;i++){
			for (int j=0;j<cuss.length;j++){
				if (secret[i]==cuss[j]){
					word = word + secret[i];
					break;
				}
			}
		}
		if (word.equals(cussIn)) return true;
		else return false;
	}
	public static int count(ArrayList<String> words, String cuss){
		int num = 0;
		for (int i = 0;i<words.size();i++){
			if (problem(words.get(i),cuss)) num ++;
		}
		return num;
	}

}
