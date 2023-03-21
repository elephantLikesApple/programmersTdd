package org.example.level0.p120893;

import java.util.stream.Collectors;
public class p120893 {
}

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(c-> (Character.isUpperCase(c) ? (char)Character.toLowerCase(c)+"" : (char)Character.toUpperCase(c)+""))
                .collect(Collectors.joining());

    }
}