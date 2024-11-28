def solution(N, info, game):
    result = 0
    N = info[0][0]
    rival = info[1]

    # @TODO : 시간복잡도 줄이기
    for i in range(N):
        for j in range(len(game)):
            if rival[i] in game[j]:
                for k in range(len(game[j])):
                    if game[j][k] not in rival:
                        rival.append(game[j][k])
    
    maxV = len(game)
    for g in game:
        for r in rival:
            if r in g:
                maxV -= 1
                break

    result = maxV
    return result


# 아래는 테스트케이스 출력을 해보기 위한 코드입니다.
N = 5
info = [[ 1 ], [ 4 ]]
game = [[1, 2], [3], [3, 4]]
ret = solution(N, info, game)

# [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은", ret, "입니다.")

N = 7
info = [[ 3 ], [ 1, 2, 3 ]]
game = [[1], [2], [3], [4], [5], [6], [4, 5], [3, 6]]
ret = solution(N, info, game)

# [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은", ret, "입니다.")
