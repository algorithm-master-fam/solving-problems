import java.util.*;
import java.io.*;

public class PJH_BOJ_1260_DFS와BFS{
    static ArrayList<ArrayList<Integer>> G;
    static int N,M,S;
    static boolean[]V;
    static StringBuilder sb;

    static void dfs(int n) {
        V[n] = true;
        sb.append(n + 1).append(" ");
        for(int e: G.get(n))
            if(!V[e])
                dfs(e);
    }

    static void bfs(int n) {
        int[] q = new int[1000];
        int front = 0; int rear = 0;
        V[n] = true;
        q[rear++] = n;
        while(front != rear) {
            n = q[front++];
            sb.append(n + 1).append(" ");
            for(int e: G.get(n))
                if(!V[e]) {
                    V[e] = true;
                    q[rear++] = e;
                }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        G = new ArrayList<>();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken())-1;

        for(int i = 0; i<N; i++)
            G.add(new ArrayList<>());

        for(int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken())-1;
            int n2 = Integer.parseInt(st.nextToken())-1;
            G.get(n1).add(n2);
            G.get(n2).add(n1);
        }

        for(int i = 0; i<N; i++) {
            Collections.sort(G.get(i));
        }

        sb = new StringBuilder();
        V = new boolean[N];

        dfs(S);
        System.out.println(sb.toString());

        sb = new StringBuilder();
        V = new boolean[N];

        bfs(S);
        System.out.println(sb.toString());
    }
}
