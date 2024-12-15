def solution(commands):
	answer = []

    ####
	p = [0, 0]

	for c in commands:
		if c == "U":
			p[1] += 1		
		elif c == "D":
			p[1] -= 1				
		elif c == "R":
			p[0] += 1							
		elif c == "L":
			p[0] -= 1							
	
	answer = p
	####

	return answer

commands = "URDDL"
ret = solution(commands)

print("solution 함수의 반환 값은", ret, "입니다.")