def solution(arr, K):
	answer = 0

	####	
	T = len(arr)
	tmp = []

	for i in range(T):
		for j in range(i+1, T):
			for k in range(j+1, T):
				if (arr[i]+arr[j]+arr[k]) % K == 0 and arr[i] < arr[j] and arr[j] < arr[k]:
					tmp.append([arr[i], arr[j], arr[k]])
	
	answer = len(tmp)
	####
	
	return answer

arr = [1, 2, 3, 4, 5]
K = 3
ret = solution(arr, K)

print("solution 함수의 반환 값은", ret, "입니다.")