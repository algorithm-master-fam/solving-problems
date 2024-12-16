def solution(num):
	answer = 0
	
	####
	yes0 = num + 1
	strYes0 = str(yes0)
	
	result = []
	for s in strYes0:
		if s == "0":
			result.append("1")
		else:
			result.append(s)
	
	answer = int("".join(result))
	####

	return answer

num = 9949999
ret = solution(num)
 
print("solution 함수의 반환 값은", ret, "입니다.")