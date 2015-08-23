package mathDice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Pls {

    private static int target;
    private static ArrayList<Integer> rolls;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        rolls = new ArrayList<Integer>();
        String[] entries = s.nextLine().split(" ");

        Random rand = new Random();

        int n1 = Integer.parseInt(entries[0].substring(0, entries[0].indexOf('d')));
        int x1 = Integer.parseInt(entries[0].substring(entries[0].indexOf('d') + 1, entries[0].length()));
        for(int i = 0; i < n1; i++) {
            target += rand.nextInt((x1 - 1) + 1) + 1;
        }


        int n2 = Integer.parseInt(entries[1].substring(0, entries[1].indexOf('d')));
        int x2 = Integer.parseInt(entries[1].substring(entries[1].indexOf('d') + 1, entries[1].length()));
        for(int i = 0; i < n2; i++) {
            rolls.add(rand.nextInt((x2 - 1) + 1) + 1);
        }
        Collections.sort(rolls);
        Collections.reverse(rolls);
        System.out.println("Target: " + target);
        System.out.println("Dice Rolls: " + rolls);

        for(int i = rolls.size(); i > 0; i--) {
            if (findTarget(i) == true) {
                System.exit(1);
            }
        }
        System.out.println("No Possible Soln");
        System.out.println("Score: " + -1);
    }

    private static boolean findTarget(int nums) {
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
