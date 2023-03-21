package org.example.level0.p120851;

import java.util.Arrays;

public class p120851 {
}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char c : my_string.toCharArray()) {
            if( '0' <= c && c <= '9' ) answer += Integer.parseInt(c+"");
        }
        return answer;
    }
}
