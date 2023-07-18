package org.example;

/* Instructions:
Create a function that will return a string that combines all the letters of the three inputted strings in groups.
Taking the first letter of all the inputs and grouping them next to each other
* */
public class Solution {

    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            sb.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return sb.toString();
    }
}
