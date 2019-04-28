package solution;

public class Solution {

    public int countingValleys(int n, String s) {
        int countValley = 0;
        int mountain = 0;
        boolean estaNoVale = false;
        String[] split = s.split("");

        for (String step : split) {
            if (step.equalsIgnoreCase("U")) {
                mountain++;
                if (mountain >= 0) {
                    estaNoVale = false;
                }
            } else if (step.equalsIgnoreCase("D")) {
                mountain--;
                if (mountain < 0 && !estaNoVale) {
                    estaNoVale = true;
                    countValley++;
                }
            }
        }
        return countValley;
    }
}
