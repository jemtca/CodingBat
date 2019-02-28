
# given a string, return the longest substring that appears at both the beginning and end of the string without overlapping
def same_ends(str):
    s = ''
    end = 1

    for x in range(int(len(str)/2)):
        # print(str[start:x+1])
        # print(str[len(str)-end:])
        if str[:x+1] == str[len(str)-end:]:
            s = str[:x+1]
        end += 1

    return s

print(same_ends('abXYab'))
print(same_ends('xx'))
print(same_ends('xxx'))
