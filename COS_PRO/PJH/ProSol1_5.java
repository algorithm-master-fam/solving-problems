package COS_PRO.PJH;

import java.util.*;

class ProSol1_5 {
    public int solution(int n) {
        int answer = 0;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int[][] arr = new int[n][n];

        int index = 0;
        int x = 0, y = 0;
        int start = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[x][y] = start++;

            }
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        ProSol1_5 sol = new ProSol1_5();
        int n1 = 3;
        int ret1 = sol.solution(n1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int ret2 = sol.solution(n2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
