package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(7, 1));
    }
}

class Solution {
    public static int solution(int slice, int n) {
        int answer = (n + slice - 1) / slice;
        return answer;
    }
}