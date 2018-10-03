
# this function return true if the given int values are in range 13-19 inclusive
def has_teen(a,b,c):
	
	b = False

	if (a >= 13 or a <= 19) and (b >= 13 or b <= 19) and (c >= 13 or c <= 19):
		b = True

	return b

print(has_teen(13,20,10))
print(has_teen(20,19,10))
print(has_teen(10,10,13))
