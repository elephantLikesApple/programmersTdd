package org.example.level0.p120829;

public class p120829 {
    public static void main(String[] args) {
        //System.out.println(Solution.solution(70));
    }
}

class Solution {
    public static int solution(int angle) {
        return (angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : 3);
    }
}