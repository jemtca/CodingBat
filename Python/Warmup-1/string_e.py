
# this function return true if the given string contains between 1 and 3 'e' chars
def string_e(str):
	
	b = False
	count = 0

	for x in str:
		if x == 'e':
			count += 1

	if count >= 1 and count <= 3:
		b = True

	return b

print(string_e("Hello"))
print(string_e("Heelle"))
print(string_e("Heelele"))
