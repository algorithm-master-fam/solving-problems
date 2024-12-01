package COS_PRO.PJH;

import java.util.HashSet;
import java.util.Set;

public class Java08 {
    public int solution(int numberA, int numberB, int limit) {
        // 여기에 코드를 작성해주세요.
        Set<Integer> cnt = new HashSet<>();

        for(int i = 1; i * numberA <= limit; i++) {
            cnt.add(i * numberA);
        }

        for(int i = 1; i * numberB <= limit; i++) {
            cnt.add(i * numberB);
        }

        return cnt.size();
    }

    // 아래는 테스트케이스를 출력해 보기 위한 main 함수입니다.
    public static void main(String[] args) {
        Java08 sol = new Java08();
        int numberA1 = 2;
        int numberB1 = 4;
        int limit1 = 10;
        int ret1 = sol.solution(numberA1, numberB1, limit1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int numberA2 = 2;
        int numberB2 = 3;
        int limit2 = 10;
        int ret2 = sol.solution(numberA2, numberB2, limit2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}

