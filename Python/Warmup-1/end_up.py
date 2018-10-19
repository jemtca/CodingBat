
# this function return a string where the last three chars are now in upper case
# if the string has lees than 3 chars, uppercase whatever is there
def end_up(str):
	s = ""

	if len(str) < 3:
		s = str.upper()
	else:
		last3 = str[-3:].upper()
		s = str[:len(str) - 3] + last3

	return s

print(end_up("hello"))
print(end_up("hi there"))
print(end_up("hi"))
