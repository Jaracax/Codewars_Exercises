package org.example;

/*Instructions:
Consider an array/list of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present).
* */
public class Solution {

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean x : arrayOfSheeps){
            if (x != null && x){
                count++;
            }
        }
        return count;
    }
}
