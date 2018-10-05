
# this function return true if the two given not-negative int values have the same last digit
def last_digit(a, b):
	bool = False
	s1 = str(a)
	s2 = str(b) 

	if s1[-1] == s2[-1]:
		bool = True

	return bool

print(last_digit(7, 17))
print(last_digit(6, 17))
print(last_digit(3, 113))
