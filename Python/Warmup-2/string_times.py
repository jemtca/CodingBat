
# this function return a new string that is n copies of the given string
# n is a non negative int value
def string_times(str, n):
	s = ""

	for _ in range(n):
		s = s + str

	return s

print(string_times("Hi", 2))
print(string_times("Hi", 3))
print(string_times("Hi", 1))
