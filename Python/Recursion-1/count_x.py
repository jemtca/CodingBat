
# given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string
def count_x(str):
    count = 0

    if not str:
        return count
    if str[0].lower() == 'x':
        count += 1

    return count + count_x(str[1:])

print(count_x('xxhixx'))
print(count_x('xhixhix'))
print(count_x('hi'))
