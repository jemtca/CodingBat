
# this function return true if one of the two given temperatures is less than 0 and the other is greater than 100
def icy_hot(temp1, temp2):
	b = False

	if (temp1 < 0 and temp2 > 0) or (temp1 > 0 and temp2 < 0):
		b = True

	return b

print(icy_hot(120, -1))
print(icy_hot(-1, 120))
print(icy_hot(2, 120))
