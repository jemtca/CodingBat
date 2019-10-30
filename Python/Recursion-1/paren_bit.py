
# given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)"
def paren_bit(str):
	if str[0] == ')':
		return ''

	if str[0] == '(':
		index = str.index(')')
		return str[0:index+1] + paren_bit(str[index:])
	else:
		return paren_bit(str[1:])

print(paren_bit('xyz(abc)123'))
print(paren_bit('x(hello)'))
print(paren_bit('(xy)1'))
