def solution(phrases, second):
	answer = ''
	
    ####
	sentence = "______________" + phrases
	answer = sentence[(second%14):(14+second%14)]
    ####

	return answer

phrases = "happy-birthday"
second = 3
ret = solution(phrases, second)

print("solution 함수의 반환 값은", ret, "입니다.")