package COS_PRO.PJH;

import java.util.Arrays;
import java.util.Comparator;

public class Java10 {
    public int[] solution(int[][] household) {
        Arrays.sort(household, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[1] != b[1]) return b[1] - a[1];
                if(a[2] != b[2]) return b[2] - a[2];
                if(a[3] != b[3]) return b[3] - a[3];
                return a[0] - b[0];
            }
        });

        int[] answer = new int[household.length];
        for(int i = 0; i < household.length; i++)
            answer[i] = household[i][0];
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Java10 sol = new Java10();
        int[][] household =  { {1, 1, 2, 60}, {2, 1, 2, 85}, {3, 0, 0, 70}, {4, 0, 0, 70}, {5, 1, 3 , 90} };
        int[] ret = sol.solution(household);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }

}
