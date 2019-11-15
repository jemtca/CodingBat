
# given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char
# so "yyzzza" yields "yza"
def string_clean(str):
	if not str:
		return ''

	if len(str) > 1 and str[0] == str[1]:
		return string_clean(str[1:])
	else:
		return str[0] + string_clean(str[1:])

print(string_clean('yyzzza'))
print(string_clean('abbbcdd'))
print(string_clean('Hello'))
