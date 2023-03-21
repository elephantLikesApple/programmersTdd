package org.example.gold5.v7576;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class b7576Test {

    @Test
    public void t1() {
        int[][] arr = { {1, -1, 0, 0, 0, 0}, {0, -1, 0, 0, 0, 0}, {0, 0, 0, 0, -1, 0}, {0, 0, 0, 0, -1, 1} };

        assertThat(b7576.solution(6, 4, arr)).isEqualTo(6);
    }

    @Test
    public void t2() {
        int[][] arr = { {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1} };

        assertThat(b7576.solution(6, 4, arr)).isEqualTo(8);
    }
}