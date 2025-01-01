package Dijkstra;
import java.util.*;
import java.io.*;

class QEntry implements Comparable<QEntry>{
    int r,c, cost;
    QEntry(int r, int c, int cost) {
        this.r = r;
        this.c = c;
        this.cost = cost;
    }

    @Override
    public int compareTo(QEntry o) {
        return (cost - o.cost);
    }
}

public class PJH_BOJ_4458_녹입젤{
    static int N;
    static int [][] A;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static final int INF = Integer.MAX_VALUE;

    static boolean Valid(int x, int y) {
        if(x<0 || x>=N || y<0 || y>=N)
            return false;
        return true;
    }

    static int Dijkstra() {
        PriorityQueue<QEntry> Q = new PriorityQueue<QEntry>();
        boolean[][] V = new boolean[N][N];
        int [][] cost = new int[N][N];
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                cost[i][j] =INF;
            }
        }
        cost[0][0] = A[0][0];
        Q.add(new QEntry(0,0,cost[0][0]));
        while(!Q.isEmpty()) {
            QEntry qe = Q.poll();
            int x = qe.r; int y = qe.c;
            for(int i = 0; i<4; i++) {
                int nx = x+ dx[i], ny = y + dy[i];
                if(Valid(nx,ny)==true) {
                    if(cost[nx][ny]>cost[x][y] + A[nx][ny]) {
                        cost[nx][ny] = cost[x][y] + A[nx][ny];
                        Q.add(new QEntry(nx,ny,cost[x][y]));
                    }
                }
            }
        }
        return cost[N-1][N-1];
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cnt = 1; // 반복횟수
        while (true) {
            N = sc.nextInt();
            if (N == 0) {
                break;
            }
            A = new int[N][N];
            //V = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            System.out.println("Problem " +cnt + ": " + Dijkstra());
            cnt++;
        }
    }
}
