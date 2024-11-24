import java.util.*;
import java.io.*;

public class PJH_BOJ_2667_단지번호붙이기{
    static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    static int[][] G;
    static int[][] Q;
    static boolean[][] V;
    static int front, rear, N;

    static boolean Valid(int r, int c) {
        if( r >= N || r < 0) return false;
        return c < N && c >= 0;
    }

    static int Fill(int x, int y) {
        rear = 0; front = 0; V[x][y] = true;
        Q[rear][0] = x; Q[rear++][1] = y;

        int cnt =1;
        while(front != rear) {
            int rr = Q[front][0], cc = Q[front++][1];
            for(int i = 0; i<4; i++) {
                int nx = rr + dir[i][0];
                int ny = cc + dir[i][1];
                if(!Valid(nx, ny)) continue;
                if(!V[nx][ny] && G[nx][ny] == 0) {
                    V[nx][ny] = true;
                    Q[rear][0] = nx; Q[rear++][1] =ny;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        G = new int[N][N];
        for(int i = 0; i<N; i++) {
            String str = sc.next();
            for(int j = 0; j<N; j++)
                G[i][j] = str.charAt(j)-'1';
        }
        sc.close();

        ArrayList<Integer> ll = new ArrayList<>();
        Q = new int[100000][2];
        V = new boolean[N][N];
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++)
                if(!V[i][j] && G[i][j] == 0)
                    ll.add(Fill(i,j));
        }

        Collections.sort(ll);

        StringBuilder sb = new StringBuilder();
        sb.append(ll.size()).append("\n");
        for(int e : ll)
            sb.append(e).append("\n");
        System.out.println(sb);
    }
}
