
# this function return true if one of the two given values is "teen", but not both
# teen = range 13..19 inclusive
def lone_teen(a, b):
	bool = False

	if (a >= 13 and a <= 19) and (b >= 13 and b <= 19):
		bool = False
	elif (a >= 13 and a <= 19):
		bool = True
	elif (b >= 13 and b <= 19):
		bool = True

	return bool

print(lone_teen(13, 99))
print(lone_teen(21, 19))
print(lone_teen(13, 13))
