
# this function return the absolute difference between n and 21,
# except return double the absolute difference if n is over 21
def diff21(n):
	return abs(n - 21) if n <= 21 else abs((n - 21) * 2)

print(diff21(19))
print(diff21(10))
print(diff21(21))
