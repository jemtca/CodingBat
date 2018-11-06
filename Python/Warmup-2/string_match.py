
# this function return the number of the positions where they contain the same length 2 substring 
def string_match(a, b):
	count = 0
	length = min(len(a), len(b))

	for x in range(0,length - 1):
		if a[x:x+2] == b[x:x+2]:
			count += 1

	return count

print(string_match("xxcaazz", "xxbaaz"))
print(string_match("abc", "abc"))
print(string_match("abc", "axc"))
