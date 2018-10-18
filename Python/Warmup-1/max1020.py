
# this function return the larger value of the two given int values that is in the range 10..20
# return 0 if neither is in that range
def max1020(a, b):
	m = 0

	if (a >= 10 and a <= 20) and (b >= 10 and b <= 20):
		m = max(a, b)
	if (a >= 10 and a <= 20) and not (b >= 10 and b <= 20):
		m = a
	if not (a >= 10 and a <= 20) and (b >= 10 and b <= 20):
		m = b

	return m

print(max1020(11, 19))
print(max1020(19, 11))
print(max1020(11, 9))
