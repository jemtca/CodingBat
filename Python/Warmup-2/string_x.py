
# this function return a new string where all the 'x' have been removed
# if the given string starts or ends with 'x', the 'x' should not be removed
def string_x(str):
	s = ""
	temp = ""

	if len(str) > 1:
		temp = str[1:-1]
		temp = temp.replace('x','')
		s = str[0] + temp + str[len(str)-1]
	else:
		s = str

	return s

print(string_x("xxHxix"))
print(string_x("abxxxcd"))
print(string_x("xabxxxcdx"))
