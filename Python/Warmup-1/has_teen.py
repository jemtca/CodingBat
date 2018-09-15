
# this function return true if the numbers given are in range 13-19 inclusive
def has_teen(a,b,c):
	
	x = False

	if (a >= 13 or a <= 19) and (b >= 13 or b <= 19) and (c >= 13 or c <= 19):
		x = True

	return x

print(has_teen(13,20,10))
print(has_teen(20,19,10))
print(has_teen(10,10,13))
