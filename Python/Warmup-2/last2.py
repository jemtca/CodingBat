
# this function return the count of the number of times
# that a substring length 2 appears in the string and also as the last 2 chars of the string
def last2(str):
	count = 0

	if len(str) > 2:
		last2chars = str[-2:]
		i = 0
		while i < len(str)-2:
			s = str[i] + str[i+1]
			if s == last2chars:
				count += 1
			i += 1

	return count

print(last2("hixxhi"))
print(last2("xaxxaxaxx"))
print(last2("axxxaaxx"))
