
# loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array append the string to the result
# return the empty string if no string appears a 2nd time
def word_append(str):
    s = ''
    d = {}

    for x in str:
        if not x in d:
            d[x] = 1
        else:
            one_added = d[x] + 1
            d[x] = one_added
        if d[x] > 1 and d[x] % 2 == 0:
            s = s + x

    return s

print(word_append(['a', 'b', 'a']))
print(word_append(['a', 'b', 'a', 'c', 'a', 'd', 'a']))
print(word_append(['a', '', 'a']))
