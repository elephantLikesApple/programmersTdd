package org.example.level0.p120837;

public class p120837 {
}

class Solution {
//    public int solution(int hp) {
//        int general = 0;
//        int soldier = 0;
//        int worker = 0;
//
//        general = hp / 5;
//        hp %= 5;
//        soldier = hp / 3;
//        worker = hp % 3;
//
//        return general+soldier+worker;
//    }
    public int solution(int hp) {
        return (hp / 5)+ (hp % 5 / 3) + (hp % 5 % 3);
    }
}