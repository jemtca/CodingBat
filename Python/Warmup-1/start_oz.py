
# this function return a string made of the two chars (if present),
# however include first char only if it is 'o' and include the second only if it is 'z'
def start_oz(str):
	s = ""

	if len(str):
		if len(str) == 1 and str[0] == 'o':
			s = str[0]
		else:
			if str[0] == 'o' and not str[1] == 'z':
				s = str[0]
			elif not str[0] == 'o' and str[1] == 'z':
				s = str[1]
			elif str[0] == 'o' and str[1] == 'z':
				s = str[0] + str[1]

	return s

print(start_oz("ozymandias"))
print(start_oz("bzoo"))
print(start_oz("oxx"))
