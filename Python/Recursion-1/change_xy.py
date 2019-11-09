
# given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars
def change_xy(str):
	if not str:
		return ''
	if str[0] != 'x':
		return str[0] + change_xy(str[1:])
	else:
		return 'y' + change_xy(str[1:])

print(change_xy('codex'))
print(change_xy('xxhixx'))
print(change_xy('xhixhix'))
