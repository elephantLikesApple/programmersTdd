package org.example.gold5.b18405;

import java.util.*;

public class b18405 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] v = new int[N+1][N+1];
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                v[i][j] = sc.nextInt();
            }
        }
        int S = sc.nextInt(); int X = sc.nextInt(); int Y = sc.nextInt();

        System.out.println(new Solution().solution(N, K, v, S, X, Y));
    }
}

class Solution {
    public int solution(int N, int K, int[][]v, int S, int X, int Y) {
        PriorityQueue<Virus> queue = new PriorityQueue<>();
        int[] dx = {-1, 1, 0, 0}; int[] dy = {0, 0, -1, 1};

        for(int i = 1; i <= N ; i++) {
            for(int j = 1; j <= N; j++) {
                if(v[i][j] != 0) {
                    queue.offer(new Virus(v[i][j], i, j, 0));
                }
            }
        }

        while(!queue.isEmpty()){
            Virus node = queue.poll();
            if(node.time == S) break;
            for(int i = 0; i< 4; i++) {
                int nextX = node.x + dx[i], nextY = node.y + dy[i];
                if(0 < nextX && nextX <= N && 0 < nextY && nextY <= N && v[nextX][nextY] == 0) {
                    v[nextX][nextY] = node.num;
                    queue.offer(new Virus(v[nextX][nextY], nextX, nextY, node.time+1));
                }
            }
        }
        return v[X][Y];
    }
}

class Virus implements Comparable<Virus> {
    int num, x, y, time;

    public Virus(int num, int x, int y, int time) {
        this.num = num;
        this.x = x;
        this.y = y;
        this.time = time;
    }

    @Override
    public int compareTo(Virus other) {
        if (this.time == other.time) {
            return Integer.compare(this.num, other.num);
        }
        return Integer.compare(this.time, other.time);
    }
}