
# this function return true if one given int value is positive and the other given int value is negative,
# except if the parameter negative is true and both int are negative
def pos_neg(a, b, negative):
	bool = False

	if negative and a < 0 and b < 0:
		bool = True
	else:
		if not negative and ((a < 0 and b > 0) or (a > 0 and b <0)):
			bool = True

	return bool

print(pos_neg(1, -1, False))
print(pos_neg(-1, 1, False))
print(pos_neg(-4, -5, True))
