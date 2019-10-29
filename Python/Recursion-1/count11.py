
# given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap
def count11(str):
	if not str:
		return 0

	if len(str) > 2 and str[0] == '1' and str[1] == '1' and str[2] == '1':
		return 1 + count11(str[2:])
	elif len(str) > 2 and str[0] == '1' and str[1] == '1' and str[2] != '1':
		return 1 + count11(str[3:])
	elif len(str) == 2 and str[0] == '1' and str[1] == '1':
		return 1 + count11(str[2:])
	else:
		return count11(str[1:]) 

print(count11('11abc11'))
print(count11('abc11x11x11'))
print(count11('111'))
