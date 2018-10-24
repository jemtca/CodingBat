
# this function return true if the fisrt instance of 'x' of the given string is immediately followed by another 'x'
# the function return false otherwise
def double_x(str):
	b = False
	length = len(str)

	index = 0
	for x in str:
		if index < len(str) - 1 and x == 'x':
			if str[index + 1] == 'x':
				b = True
			else:
				break
		index += 1

	return b

print(double_x("axxbb"))
print(double_x("axaxax"))
print(double_x("xxxxx"))
