
# given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on
#  count the number of times that the 2 strings are non-empty and start with the same char
# the strings may be any length, including 0
def match_up(a, b):
    count = 0

    for x in range(len(a)):
        if (a[x] and b[x]) and (a[x][0] == b[x][0]):
            count += 1

    return count

print(match_up(['aa', 'bb', 'cc'], ['aaa', 'xx', 'bb']))
print(match_up(['aa', 'bb', 'cc'], ['aaa', 'b', 'bb']))
print(match_up(['aa', 'bb', 'cc'], ['', '', 'ccc']))
