
# this function return a new string where all the strings "yak" are removed, but the 'a' can be any char
def string_yak(str):
	s = ""

	i = 0
	while i < len(str):
		if i < len(str)-2 and str[i] == 'y' and str[i+2] == 'k':
			i += 3
		else:
			s = s + str[i]
			i += 1

	return s

print(string_yak("yakpak"))
print(string_yak("pakyak"))
print(string_yak("yak123ya"))
