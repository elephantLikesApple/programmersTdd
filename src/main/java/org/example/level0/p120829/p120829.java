package org.example.level0.p120829;

public class p120829 {
    public static void main(String[] args) {
        //System.out.println(Solution.solution(70));
    }
}

class Solution {
    public static int solution(int angle) {
        if(angle == 180) return 4;
        else if(angle == 90) return 2;
        else if(angle > 90) return 3;
        return 1;
    }
}