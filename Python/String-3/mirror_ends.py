
# given a string, look for a mirror image (backwards) string at both the beginning and end of the given string
# in other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping)
def mirror_ends(str):
    s = ''
    temp = ''

    for x in range(len(str)-1, -1, -1):
        temp = temp + str[x]

    for x in range(len(str)):
        if str[x] == temp[x]:
            s = s + str[x]
        else:
            break

    return s

print(mirror_ends('abXYZba'))
print(mirror_ends('abca'))
print(mirror_ends('aba'))
