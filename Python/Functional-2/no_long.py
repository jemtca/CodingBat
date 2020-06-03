
# given a list of strings, return a list of the strings, omitting any string length 4 or more
def no_long(strings):
    new_list = []

    for x in strings:
        if len(x) < 4:
            new_list.append(x)

    return new_list

print(no_long(['this', 'not', 'too', 'long']))
print(no_long(['a', 'bbb', 'cccc']))
print(no_long(['cccc', 'cccc', 'cccc']))
