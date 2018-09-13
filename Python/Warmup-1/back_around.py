
# this function return a new string adding the last char at the front and at the back
def back_around(str):
	
	s = ""

	if len(str) >= 1:
		s = str[-1:] + str + str[-1:]
	else:
		print("Wrong input."),

	return s

print(back_around("cat"))
print(back_around("Hello"))
print(back_around("a"))
