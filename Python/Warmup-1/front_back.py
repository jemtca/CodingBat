
# this function return a string where the first and last chars of a given string have been exchange
def front_back(str):
	s = ""

	if len(str):
		first = str[0]
		last = str[len(str) - 1]
		if len(str) == 1:
			s = str
		elif len(str) == 2:
			s = last + first
		else:
			medium = str[1:-1]
			s = last + medium + first

	return s

print(front_back("code"))
print(front_back("a"))
print(front_back("ab"))
