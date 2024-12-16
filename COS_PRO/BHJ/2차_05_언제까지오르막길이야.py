def solution(arr):
	answer = 0

	####
	T = len(arr)
	idx = 1
	s = arr[0]
	result = []
	
	while idx < T:
		if s < arr[idx]:
			answer += 1
		else:
			result.append(answer)
		s = arr[idx]
		idx += 1
	return max(result)
    ####

arr = [3, 1, 2, 4, 5, 1, 2, 2, 3, 4]
ret = solution(arr)

print("solution 함수의 반환 값은", ret, "입니다.")