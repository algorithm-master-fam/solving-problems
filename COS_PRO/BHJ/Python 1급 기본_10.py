def solution(household):
    answer = []

    # household = [[고유번호, 자녀 유무, 자녀 수, 청약 점수], ...]
    # 자녀가 있는 가구 (1)
    # 자녀 수가 더 많은 가구 (2)
    # 청약 점수가 더 높은 가구 (3)
    # 더 작은 고유번호를 부여받은 가구 (0)

    household.sort(key=lambda x:(-x[1], -x[2], -x[3], x[0]))

    for family in household:
        answer.append(family[0])
    return answer


# 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
household = [[1,1,2,60], [2,1,2,85],[3,0,0,70],[4,0,0,70],[5,1,3,90]]
ret = solution(household)

# [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은", ret, "입니다.")