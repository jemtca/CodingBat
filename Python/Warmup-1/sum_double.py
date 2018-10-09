
# this function return the sum of the two given int values
# if the two values are the same, return double their sum
def sum_double(a, b):
	i = 0

	if a is not b:
		i = a + b
	else:
		i = (a + b) * 2

	return i

print(sum_double(1, 2))
print(sum_double(3, 2))
print(sum_double(2 ,2))
