def solution(pos):
	answer = 0

    ####
	alphabet = {"A": 1, "B": 2, "C": 3, "D": 4, "E": 5, "F": 6, "G": 7, "H": 8}
	
	sx = alphabet[pos[0]] - 1
	sy = int(pos[1]) - 1

	dx = [-2, -1, 1, 2, 2, 1, -1, -2]
	dy = [1, 2, 2, 1, -1, -2, -2, -1]

	for i in range(8):
		if 0 <= sx + dx[i] < 8 and 0 <= sy + dy[i] < 8:
			answer += 1
    ####

	return answer

pos = "A7"
ret = solution(pos)

print("solution 함수의 반환 값은", ret, "입니다.")