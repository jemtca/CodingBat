
# given a string, compute recursively a new string where all the 'x' chars have been removed
def no_x(str):
    if not str:
        return ''
    if str[0] != 'x':
        return str[0] + no_x(str[1:])
    else:
        return no_x(str[1:])

print(no_x('xxhixx'))
print(no_x('xhixhix'))
print(no_x('hi'))
