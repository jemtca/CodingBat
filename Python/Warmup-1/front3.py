
# this function return a new string which is three copies of the front
# front = three first chars
def front3(str):
	s = ""

	if len(str) < 3:
		s = str + str + str
	else:
		s = str[:3] + str[:3] + str[:3]

	return s

print(front3("Java"))
print(front3("Chocolate"))
print(front3("abc"))
