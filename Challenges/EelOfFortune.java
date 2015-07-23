
public class EelOfFortune {
	//problem("synchronized", "snond") -> true
	//problem("misfunctioned", "snond") -> true
	//problem("mispronounced", "snond") -> false
	//problem("shotgunned", "snond"); -> false
	//problem("dnons", "snond"); -> false
	public static void main(String[] args) {
		System.out.println(problem("synchronized", "snond"));
		System.out.println(problem("misfunctioned", "snond"));
		System.out.println(problem("mispronounced", "snond"));
		System.out.println(problem("shotgunned", "snond"));
		System.out.println(problem("dnons", "snond"));
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

}
