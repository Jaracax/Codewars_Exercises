package org.example;

/* Instructions:
You are given the length and width of a 4-sided polygon.
The polygon can either be a rectangle or a square.
If it is a square, return its area. If it is a rectangle, return its perimeter.
* */
public class Solution {

    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : l * 2 + w * 2;

    }
}
