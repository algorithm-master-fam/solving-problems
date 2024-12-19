def solution(hour, minute):
	answer = ''

    ####
	h = hour * 30 + minute * 0.5
	m = 360 * (minute/60)
	
	if h <= m:
		answer = m - h
	else:
		answer = h - m
	####

	return "{:.1f}".format(answer)

hour = 3
minute = 0
ret = solution(hour, minute)

print("solution 함수의 반환 값은", ret, "입니다.")