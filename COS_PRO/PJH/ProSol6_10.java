package COS_PRO.PJH;

public class ProSol6_10 {
    public int solution(int K, String[] words) {
        int answer = 1;
        int currentLength = 0;

        for (String word : words) {
            if (currentLength + word.length() + (currentLength > 0 ? 1 : 0) > K) {
                answer++;
                currentLength = word.length();
            } else {
                currentLength += (currentLength > 0 ? 1 : 0) + word.length();
            }
        }

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        ProSol6_10 sol = new ProSol6_10();
        int K = 10;
        String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi")};
        int ret = sol.solution(K, words);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
    }
}
