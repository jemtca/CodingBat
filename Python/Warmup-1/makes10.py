
# this function return true if one of the two given int values is ten or their sum is ten
def makes10(a, b):
	bool = False

	if a == 10 or b == 10 or a + b == 10:
		bool = True

	return bool

print(makes10(9, 10))
print(makes10(9 ,9))
print(makes10(1, 9))
