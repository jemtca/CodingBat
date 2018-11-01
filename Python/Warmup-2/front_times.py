
# this function return a string with n copies of the front
# front = 3 first chars of the given string
def front_times(str, n):
	s = ""

	for x in range(n):
		if len(str) > 2:
			s = s + str[:3]
		else:
			s = s + str

	return s

print(front_times("Chocolate", 2))
print(front_times("Chocolate", 3))
print(front_times("Abc", 2))
