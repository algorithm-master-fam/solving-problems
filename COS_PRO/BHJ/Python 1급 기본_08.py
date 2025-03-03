# 다음과 같이 import를 사용할 수 있습니다.
# import math

def solution(numberA, numberB, limit):
    # 여기에 코드를 작성해주세요.
    answer = [0] * 1001

    # numberA
    cur = numberA
    while cur <= limit and answer[cur] != 1:
        answer[cur] = 1
        cur += numberA
    
    # numberB
    cur = numberB
    while cur <= limit and answer[cur] != 1:
        answer[cur] = 1
        cur += numberB
    
    # numberA + numberB
    for a in range(limit // numberA + 1):
        for b in range(limit // numberB + 1):
            _sum = a * numberA + b * numberB
            if 0 < _sum <= limit and answer[_sum] != 1:
                answer[_sum] = 1
    
    return sum(answer[1:])

# 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 
numberA1 = 2
numberB1 = 4
limit1 = 10
ret1 = solution(numberA1, numberB1, limit1)

# [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은", ret1, "입니다.")

numberA2 = 2
numberB2 = 3
limit2 = 10
ret2 = solution(numberA2, numberB2, limit2)

# [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은", ret2, "입니다.")
