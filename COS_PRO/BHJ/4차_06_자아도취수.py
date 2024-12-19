def power(base, exponent):
	val = 1
	for i in range(exponent):
		val *= base
	return val

def solution(k):
	answer = []
	bound = power(10, k)
	for i in range(bound // 10, bound):
		current = i
		calculated = 0
		while current != 0:
			calculated += (current // 100)**3 + (current % 100 // 10)**3 + (current % 10)**3 ####
			break ####
		if calculated == i:
			answer.append(i)
	return answer

k = 3
ret = solution(k)

print("solution 함수의 반환 값은", ret, "입니다.")