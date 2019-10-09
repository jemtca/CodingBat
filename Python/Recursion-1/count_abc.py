
# count recursively the total number of "abc" and "aba" substrings that appear in the given string
def count_abc(str):
    count = 0

    if not str:
        return count
    if len(str) > 2 and (str[:3] == 'abc' or str[:3] == 'aba'):
        count += 1
        return count + count_abc(str[2:])
    else:
        return count + count_abc(str[1:])

print(count_abc('abc'))
print(count_abc('abcxxabc'))
print(count_abc('abaxxaba'))
