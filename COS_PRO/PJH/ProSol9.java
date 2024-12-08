package COS_PRO.PJH;

import java.util.*;

public class ProSol9 {
    public int solution(int[] arr, int K) {
        // 선 정렬 -> 연속된 K개의 숫자들이 가장 작은 차이를 가질 수 있도록
        Arrays.sort(arr);

        // 최솟값 구하기
        int minDiff = Integer.MAX_VALUE;

        // K개 연속된 숫자에 대한 차이 계산
        for (int i = 0; i <= arr.length - K; i++) {
            int diff = arr[i + K - 1] - arr[i]; // 큰 값 - 작은 값
            minDiff = Math.min(minDiff, diff); // 값 갱신
        }

        return minDiff;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        ProSol9 sol = new ProSol9();
        int[] arr = {9, 11, 9, 6, 4, 19};
        int K = 4;
        int ret = sol.solution(arr, K);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
    }

}
