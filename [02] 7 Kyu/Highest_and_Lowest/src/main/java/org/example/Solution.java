package org.example;

/*Instructions:
* You are given a string of space separated numbers, and have to return the highest and lowest number.
*/
public class Solution {

    public static String highAndLow(String numbers) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        String[] stringArray = numbers.split("\\s");
        int[] result = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            result[i] = Integer.parseInt(stringArray[i]);
        }
        for (int j : result) {
            if (j > maxValue) {
                maxValue = j;
            }
            if (j < minValue) {
                minValue = j;
            }
        }
        return maxValue + " " + minValue;
    }
}
