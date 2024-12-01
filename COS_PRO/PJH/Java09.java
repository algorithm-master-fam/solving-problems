package COS_PRO.PJH;

import java.util.ArrayList;

public class Java09 {
    static ArrayList<ArrayList<Integer>> G;
    static boolean[] isExposed;
    static boolean[] visited;

    static void dfs(int n) {
        visited[n] = true;
        isExposed[n] = true;

        for(int next : G.get(n)) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }

    public int solution(int N, int[][] info, int[][] game) {
        G = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        for(int[] g : game) {
            for(int i = 0; i < g.length - 1; i++) {
                G.get(g[i] - 1).add(g[i+1] - 1);
                G.get(g[i+1] - 1).add(g[i] - 1);
            }
        }

        //전략을 아는 플레이어 추적
        isExposed = new boolean[N];
        visited = new boolean[N];
        for(int player : info[1]) {
            if(!visited[player - 1]) {
                dfs(player - 1);
            }
        }

        int result = 0;
        for(int[] g : game) {
            boolean isSafe = true;
            for(int player : g) {
                if(isExposed[player - 1]) {
                    isSafe = false;
                    break;
                }
            }
            if(isSafe) result++;
        }
        return result;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 함수입니다.
    public static void main(String[] args) {

        Java09 sol = new Java09();
        int N = 5;
        int[][] info = { { 1 }, { 4 } };
        int[][] game = { { 1,2 }, {3}, { 3, 4 } };
        int ret = sol.solution(N, info, game);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");


        int N2 = 7;
        int[][] info2 = { { 3 }, { 1, 2, 3 } };
        int[][] game2 = {{1}, {2}, {3}, {4}, {5}, {6}, {4, 5}, {3, 6}};
        int ret2 = sol.solution(N2, info2, game2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }

}
