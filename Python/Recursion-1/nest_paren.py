
# given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))"
def nest_paren(str):
	if not str:
		return True

	if str[0] == '(' and str[len(str)-1] == ')':
		return nest_paren(str[1:len(str)-1])
	else:
		return False

print(nest_paren('(())'))
print(nest_paren('((()))'))
print(nest_paren('(((x))'))
