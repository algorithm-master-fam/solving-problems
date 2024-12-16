def solution(s1, s2):
	answer = 200
	
    ####
	minLen = min(len(s1), len(s2))
	totalLen = len(s1) + len(s2)

	for i in range(1, minLen):
		if s1[0:i] == s2[-i:]:
			answer = min(answer, totalLen-len(s1[0:i]))
	
	for i in range(1, minLen):
		if s2[0:i] == s1[-i:]:
			answer = min(answer, totalLen-len(s2[0:i]))
    ####

	return answer

s1 = "ababc"
s2 = "abcdab"
ret = solution(s1, s2)

print("solution 함수의 반환 값은", ret, "입니다.")