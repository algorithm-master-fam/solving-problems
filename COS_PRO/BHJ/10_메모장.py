# 풀이 중

# 다음과 같이 import를 사용할 수 있습니다.
# import math

def solution(K, words):
    # 여기에 코드를 작성해주세요.
    answer = 1
    lk = K

    for word in words:
        word_length = len(word)
        # 현재 줄에 단어를 추가할 수 없는 경우
        if lk < word_length + (1 if lk < K else 0):
            answer += 1  # 새로운 줄 시작
            lk = K  # 남은 공간 초기화

        # 단어를 현재 줄에 추가
        lk -= word_length
        if lk > 0:  # 공백이 필요한 경우
            lk -= 1

    return answer
        
# 아래는 테스트케이스 출력을 해보기 위한 코드입니다.
K = 10
words = ["nice", "happy", "hello", "world", "hi"]
ret = solution(10, words)

# [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은", ret, "입니다.")
