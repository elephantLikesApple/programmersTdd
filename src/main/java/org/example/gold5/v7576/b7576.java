package org.example.gold5.v7576;

import java.awt.*;
import java.util.*;

public class b7576 {
    final static Scanner sc = new Scanner(System.in);
    static int count = 0, n = 0, m = 0;
    static int[][] arr = new int[1000][1000];
    static int[][] visited = new int[1000][1000];
    static Queue<Point> queue = new LinkedList<>();
    public static void main(String[] args) {
        m = sc.nextInt(); n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(m, n, arr));
    }

    public static int solution(int m, int n, int[][] arr) {
        b7576.m = m; b7576.n = n; b7576.arr = arr;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 1 && visited[i][j] == 0) {
                    queue.add(new Point(i,j));
                    visited[i][j] = 1;
                }
            }
        }
        bfs();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 0 && visited[i][j] == 0) {
                    return -1;
                }
            }
        }
        return count-1;
    }

    public static void bfs() {
        int[] dx = {-1, 1, 0, 0}; // 위 아래 왼쪽 오른쪽
        int[] dy = {0, 0, -1, 1};
        while(!queue.isEmpty()) {
            int queueSize = queue.size();
            while(queueSize > 0) {
                Point node = queue.poll();
                for(int i = 0; i < 4; i++) {
                    int nextX = node.x + dx[i], nextY = node.y + dy[i];
                    if(0 <= nextX && nextX < n && 0 <= nextY && nextY < m && visited[nextX][nextY] == 0 && arr[nextX][nextY] == 0) {
                        visited[nextX][nextY] = 1;
                        queue.add(new Point(nextX, nextY));
                    }
                }
                queueSize--;
            }
            count++;
        }
    }
}