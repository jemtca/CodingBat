
# given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca"
# repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd"
# ignore any group of fewer than 3 chars at the end
def one_two(str):
    s = ''
    i = 0

    if len(str) > 2:
        while (i < len(str)-2):
            s = s + str[i+1] + str[i+2] + str[i]
            i = i + 3

    return s

print(one_two('abc'))
print(one_two('tca'))
print(one_two('tcagdo'))
