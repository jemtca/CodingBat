
# this function return a new string where "not" is added to the front
# if the string already begin with "not", the function return the string unchanged
def not_string(str):
	s = ""

	if not str.startswith("not"):
		s = "not " + str
	else:
		s = str

	return s

print(not_string("candy"))
print(not_string("x"))
print(not_string("not bad"))
