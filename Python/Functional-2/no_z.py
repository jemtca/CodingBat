
# given a list of strings, return a list of the strings, omitting any string that contains a 'z'
def no_z(strings):
    new_list = []

    for x in strings:
        if not 'z' in x:
            new_list.append(x)

    return new_list

print(no_z(['aaa', 'bbb', 'aza']))
print(no_z(['hziz', 'hzello', 'hi']))
print(no_z(['hello', 'howz', 'are', 'youz']))
