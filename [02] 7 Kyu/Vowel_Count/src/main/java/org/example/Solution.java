package org.example;

/*Instructions:
* Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.*/
public class Solution {

    public static int firstSolution(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
                    break;
            }
        }
        return vowelsCount;
    }
    public static int secondSolution(String str) {
        int vowelsCount = 0;
        for(char c : str.toLowerCase().toCharArray())
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        return vowelsCount;
    }
}
