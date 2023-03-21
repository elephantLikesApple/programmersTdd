package org.example.level0.p120906;

public class p120906 {
}

class Solution {
//    public int solution(int n) {
//        int answer=0;
//        String str = n + "";
//        for(int i = 0; i< str.length(); i++) {
//            char c = str.charAt(i);
//            answer += Integer.parseInt(c+"");
//        }
//        return answer;
//    }

    public int solution(int n) {
        return (n + "").chars() // chars() : stream이 된다.
                .map(Character::getNumericValue) // 모두 int로
                .sum(); // 모두 더함
    }
}