
# given two int values, the function returns the nearest number to the value 10
# return 0 in the event of a tie
def close10(a, b):
	
	x = 0
	y = abs(10 - a)
	z = abs(10 - b)

	if y < z:
		x = a
	if y > z:
		x = b

	return x

print(close10(8,13))
print(close10(13,8))
print(close10(13,7))
