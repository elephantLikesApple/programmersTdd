package org.example.level0.p120850;

import java.util.stream.Collectors;

public class p120850 {
}

class Solution {
    public int[] solution(String my_string) {
        return my_string.chars().filter(c -> Character.isDigit(c)).map(e -> e-'0').sorted().toArray();
    }
}
