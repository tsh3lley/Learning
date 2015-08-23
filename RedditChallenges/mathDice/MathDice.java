package mathDice;

public class MathDice {

	public static void main(String[] args) {
		Die targetDie = new Die(1,12);
		int target = targetDie.roll();
		
	}
	
	private static boolean solve(int nums) {
        int testTarget = 0;
        String record = "";

        for(int i = 0; i < nums; i++) {
            if (testTarget < target || testTarget == target) {
                testTarget += rolls.get(i);
                record += " + " + rolls.get(i);
            } else if (testTarget > target) {
                testTarget -= rolls.get(i);
                record += " - " + rolls.get(i);
            } 
        }

        if (testTarget == target) {
            System.out.println("Done: " + record.substring(3, record.length()));
            System.out.println("Score: " + nums);
            return true;
        }

        return false;
    }

}
