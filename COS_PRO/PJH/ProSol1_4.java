package COS_PRO.PJH;

class ProSol1_4 {
    public long solution(long num) {
        num++;
        String s = Long.toString(num);
        s = s.replace('0', '1');
        long answer = Long.parseLong(s);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        ProSol1_4 sol = new ProSol1_4();
        long num = 9949999;
        long ret = sol.solution(num);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
