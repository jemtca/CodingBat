
# this function return true if either of the two given int values is in the range 10..20 inclusive
def in1020(a, b):
	bool = False

	if ((a >= 10 and a <= 20) or (b >= 10 and b <= 20)):
		bool = True

	return bool

print(in1020(12, 99))
print(in1020(21, 12))
print(in1020(8, 99))
