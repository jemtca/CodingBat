
# this function return true if the given int value is within 10 of 100 or 200
def near_hundred(n):
	return True if abs(100 - n) <= 10 or abs (200 - n) <= 10 else False

print(near_hundred(93))
print(near_hundred(90))
print(near_hundred(89))
