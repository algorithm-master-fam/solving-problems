package COS_PRO.PJH;

import java.util.*;

public class ProSol8 {
    public int solution(int[][] garden) {
        int n = garden.length;
        int m = garden[0].length;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 1. BFS를 위한 큐 생성
        Queue<int[]> queue = new LinkedList<>();

        // 2. 이미 핀 꽃들 큐에 넣기
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (garden[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;  // 이미 핀 꽃들에 대한 방문 처리
                }
            }
        }

        // 3. BFS를 통한 꽃이 피는 일수를 구하기
        int days = -1;
        while (!queue.isEmpty()) {
            int size = queue.size(); // 하루 동안 피울 꽃의 수
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                for (int dir = 0; dir < 4; dir++) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];

                    // 범위를 벗어나지 않고, 아직 피지 않은 꽃인 경우
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && garden[nx][ny] == 0) {
                        garden[nx][ny] = 1;
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
            days++; // 하루 지날 경우 일수 증가
        }
        return days;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        ProSol8 sol = new ProSol8();
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}
