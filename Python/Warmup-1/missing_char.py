
# this function return a new string where the char at index n has been removed
def missing_char(str, n):
	
	s = ""

	if n >= 0 and n < len(str):
		if n == 0: # n == 0
			s = str[1:]
		elif n == len(str) - 1: # n == last character
			s = str[:-1]
		else: # n == not 0 neither last character
			s = str[:n] + str[n + 1:]
	else:
		print("Wrong index."),

	return s

print(missing_char("kitten", 1))
print(missing_char("kitten", 0))
print(missing_char("kitten", 4))
