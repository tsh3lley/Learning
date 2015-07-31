import java.util.ArrayList;
import java.util.LinkedList;


public class HyperBinary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1101
		//1021
		//221
		System.out.println(toList(13));
	}

	public static LinkedList<Integer> solve(int n){
		LinkedList<Integer> solutions = new LinkedList<Integer>();
		
		return null;
	}
	
	public static LinkedList<Integer> toList(int n){
		//lmao
		LinkedList<Integer> ans = new LinkedList<Integer>();
		char[] pls = Integer.toBinaryString(n).toCharArray();
		for (int i=0;i<pls.length;i++){
			ans.add((int) pls[i] - 48);
		}
		
		return ans;
	}
	
	public static LinkedList<Integer> hyperize(LinkedList<Integer> list, int index){
		if (list.get(index + 1) == 0 && list.get(index) == 1){
			list.get(index + 1) = 2;
			list.get(index) = 0;
			list.
			//close but need a method to do this
		}
	}
}
