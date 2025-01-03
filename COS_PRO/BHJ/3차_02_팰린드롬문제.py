def func_a(arr, s):
	return s in arr

def func_b(s):
	length = len(s)
	for i in range(length // 2):
		if s[i] != s[length - i - 1]:
			return False
	return True

def func_c(palindromes, k):
	palindromes = sorted(palindromes)
	if len(palindromes) < k:
		return "NULL"
	else:
		return palindromes[k - 1]
	
def solution(s, k):
	palindromes = []
	length = len(s)
	for start_idx in range(length):
		for cnt in range(1, length - start_idx + 1):
			sub_s = s[start_idx : start_idx + cnt]
			if func_b(sub_s) == True: ####
				if func_a(palindromes, sub_s) == False: ####
					palindromes.append(sub_s)

	answer = func_c(palindromes, k) ####
	return answer

s1 = "abcba"
k1 = 4
ret1 = solution(s1, k1)

print("solution 함수의 반환 값은", ret1, "입니다.")

s2 = "ccddcc"
k2 = 7
ret2 = solution(s2, k2)

print("solution 함수의 반환 값은", ret2, "입니다.")