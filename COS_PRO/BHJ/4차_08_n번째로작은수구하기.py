from itertools import permutations ####

def solution(card, n):
	answer = 0
	
    ####
	tmp = []
	result = []

	for i in permutations(card, len(card)):
		tmp.append(list(i))

	for word in tmp:
		a = ''.join(str(x) for x in word)
		if int(a) not in result:
			result.append(int(a))
	
	s = sorted(result)

	if n in s:
		return s.index(n) + 1
	return -1
    ####
	
card1 = [1, 2, 1, 3]
n1 = 1312
ret1 = solution(card1, n1)

print("solution 함수의 반환 값은", ret1, "입니다.")

card2 = [1, 1, 1, 2]
n2 = 1122
ret2 = solution(card2, n2)

print("solution 함수의 반환 값은", ret2, "입니다.")