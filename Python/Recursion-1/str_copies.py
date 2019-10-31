
# given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping
# n will be non-negative
def str_copies(str, sub, n):
	if (n == 0):
		return True

	if len(str) >= len(sub) and str[:len(sub)] == sub:
		return str_copies(str[1:], sub, n-1)
	elif len(str) >= len(sub):
		return str_copies(str[1:], sub, n)
	return False

print(str_copies('catcowcat', 'cat', 2))
print(str_copies('catcowcat', 'cow', 2))
print(str_copies('catcowcat', 'cow', 1))
