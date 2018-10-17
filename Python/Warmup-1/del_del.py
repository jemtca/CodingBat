
# this function return a string where "del" has been deleted from the given string if it appears
# otherwise, the function return the string unchange
def del_del(str):
	s = str

	if len(str) >= 4 and str[1:4] == "del":
		s = str[0] + str[4:]

	return s

print(del_del("adelbc"))
print(del_del("adelHello"))
print(del_del("adedbc"))
