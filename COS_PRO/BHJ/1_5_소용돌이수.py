def solution(n):
	answer = 0

	####
	arr = list([0] * n for _ in range(n))	
	idx = 2
	
	dx = [0, 1, 0, -1]
	dy = [1, 0, -1, 0]
	sx, sy = 0
	
	arr[sx][sy] = 1

	while idx <= n*n:
		for i in range(4):
			while 0 <= sx + dx[i] < n and 0 <= sy + dy[i] < n and arr[sx+dx[i]][sy+dy[i]] == 0:
				nx = sx + dx[i]
				ny = sy + dy[i]
				arr[nx][ny] = idx
				idx += 1
				sx, sy = nx, ny
	
	for i in range(n):
		answer += arr[i][i]
    ####

	return answer

n1 = 3
ret1 = solution(n1)

print("solution 함수의 반환 값은", ret1, "입니다.")
    
n2 = 2
ret2 = solution(n2)

print("solution 함수의 반환 값은", ret2, "입니다.")