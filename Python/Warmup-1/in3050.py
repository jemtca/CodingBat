
# this function return true if the two given int values are both in the range 30..40 inclusive,
# or they are both in the range 40..50 inclusive
def in3050(a, b):
	bool = False

	if ((a >= 30 and a <= 40) and (b >= 30 and b <= 40)) or ((a >= 40 and a <= 50) and (b >= 40 and b <= 50)):
		bool = True

	return bool

print(in3050(30, 31))
print(in3050(30, 41))
print(in3050(40, 50))
