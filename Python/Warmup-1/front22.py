
# this function return a new string with the two first chars of the given string added at both the front and the back
# if the string length is less than two, use whatever chars are there
def front22(str):
	s = ""

	if len(str) < 2:
		s = str + str + str
	else:
		s = str[:2] + str + str[:2]

	return s

print(front22("kitten"))
print(front22("Ha"))
print(front22("abc"))
