package COS_PRO.PJH;
import java.util.*;

class ProSol1_6 {
    public int solution(String pos) {
        int n = 8;

        int x = pos.charAt(0) - 'A' + 1;
        int y = pos.charAt(1) - '0';

        // 이동할 수 있는 8가지 방향
        int[][] moves = {
            {-2, -1}, {-2, 1},
            {-1, -2}, {-1, 2},
            {1, -2}, {1, 2},
            {2, -1}, {2, 1}
        };

        int validMoveCount = 0;

        // 이동 가능 방향 체크 후
        for (int[] move : moves) {
            int nextX = x + move[0];
            int nextY = y + move[1];

            // 체스판 안에 존재하는 경우 카운팅
            if (nextX >= 1 && nextX <= n && nextY >= 1 && nextY <= n) {
                validMoveCount++;
            }
        }

        return validMoveCount;
    }
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        ProSol1_6 sol = new ProSol1_6();
        String pos = "A7";
        int ret = sol.solution(pos);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
