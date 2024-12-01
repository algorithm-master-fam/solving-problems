from collections import deque

def solution(N, info, game):
    result = 0
    visited = [False] * (N + 1)
    queue = deque()
    for i in info[1]:
        queue.append(i)
        visited[i] = True
    while queue:
        k = queue.popleft()
        for j in game:
            if(k in j): 
                for t in j:
                    if(visited[t] == False):
                        visited[t] = True
                        queue.append(t)

    for g in game:
        if(all(not visited[player] for player in g)):
            result += 1
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