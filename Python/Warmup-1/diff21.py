
def diff21(n):
	return abs(n - 21) if n <= 21 else abs((n - 21) * 2)

print(diff21(19))
print(diff21(10))
print(diff21(21))
