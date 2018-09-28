
# this function return true if the given non-negative number is multiple of 3 or multiple or 5
def or35(n):
	b = False

	if abs(n) % 3 == 0 or abs(n) % 5 == 0:
		b = True

	return b

print(or35(3))
print(or35(10))
print(or35(8))
