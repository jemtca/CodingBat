
# start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates
# return the count of the number of strings which appear in both arrays
def common_two(a, b):
    count = 0
    found = False

    i = 0
    while i < len(a):
        if i == 0:
            j = 0
            while j < len(b) and not found:
                if a[i] == b[j]:
                    count += 1
                    found = True
                j += 1
        else:
            if a[i] != a[i-1]:
                j = 0
                while j < len(b) and not found:
                    if a[i] == b[j]:
                        count += 1
                        found = True
                    j += 1
        found = False
        i += 1

    return count

print(common_two(['a', 'c', 'x'], ['b', 'c', 'd', 'x']))
print(common_two(['a', 'c', 'x'], ['a', 'b', 'c', 'x', 'z']))
print(common_two(['a', 'b', 'c'], ['a', 'b', 'c']))
