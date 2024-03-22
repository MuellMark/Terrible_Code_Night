import java.math.*;

public class Solution {

    public static boolean isHappy(int n) {
        String strong = String.valueOf(n);

        System.out.println(System.currentTimeMillis());

        long startTime = System.currentTimeMillis();


        boolean b = isHappyHelper(strong,0,0);


        long endTime = System.currentTimeMillis();

        try {
            Thread.sleep(17500-(endTime-startTime));

        } catch (InterruptedException e) {

        }

        return b;

    }

    private static int multi = 2000000000;
    private static boolean isHappyHelper(String pastString, int postSting, int counter) {
        long[] L = new long[Integer.MAX_VALUE/multi];

        for(int l = 0; l < Integer.MAX_VALUE/multi; l++) {
            L[l] = Long.MAX_VALUE;
        }


        String firstChar = pastString.substring(0,1);
        pastString = pastString.substring(1);

        if (firstChar.equalsIgnoreCase("1")) {
            postSting += 1;
        }
        if (firstChar.equalsIgnoreCase("2")) {
            postSting += 4;
        }
        if (firstChar.equalsIgnoreCase("3")) {
            postSting += 9;
        }
        if (firstChar.equalsIgnoreCase("4")) {
            postSting += 16;
        }
        if (firstChar.equalsIgnoreCase("5")) {
            postSting += 25;
        }
        if (firstChar.equalsIgnoreCase("6")) {
            postSting += 36;
        }
        if (firstChar.equalsIgnoreCase("7")) {
            postSting += 49;
        }
        if (firstChar.equalsIgnoreCase("8")) {
            postSting += 64;
        }
        if (firstChar.equalsIgnoreCase("9")) {
            postSting += 81;
        }


        if(pastString.length() == 0) {
            if (postSting == 1) return true;
            pastString = String.valueOf(postSting);
            postSting = 0;
        }

        if(counter == 42000) return false;


        return isHappyHelper(pastString,postSting,counter+1);

    }


}