
# given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string
def end_x(str):
	if not len(str):
		return ''
	if str[0] != 'x':
		return str[0] + end_x(str[1:])
	else:
		return end_x(str[1:]) + 'x'

print(end_x('xxre'))
print(end_x('xxhixx'))
print(end_x('xhixhix'))
