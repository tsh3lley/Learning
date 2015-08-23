package mathDice;

import java.util.Random;

public class Die {
	public int num;
	public int sides;
	
	public Die(int num, int sides){
		this.num = num;
		this.sides = sides;
	}
	
	public int getNum(){
		return num;
	}
	
	public int getSides(){
		return sides;
	}
	
	public int roll(){
		Random r = new Random();
		return r.nextInt(sides + 1);
	}
	
}
