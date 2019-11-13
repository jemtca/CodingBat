
# given a string, compute recursively a new string where all the adjacent chars are now separated by a "*"
def all_star(str):
	if not str:
		return ''
	if len(str) > 1:
		return str[0] + '*' + all_star(str[1:])
	else:
		return str[0] + all_star(str[1:])

print(all_star('hello'))
print(all_star('abc'))
print(all_star('ab'))
