
# this function return the string made starting with char 0, and then every Nth char of the string
def every_nth(str, n):
	s = ""

	if str and n >= 1:
		for x in range(0,len(str),n):
			s = s + str[x]
	else:
		print("Wrong input."),

	return s


print(every_nth("Miracle",2))
print(every_nth("abcdefg",2))
print(every_nth("abcdefg",3))
