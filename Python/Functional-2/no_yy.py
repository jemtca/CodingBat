
# given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere
def no_yy(strings):
    new_list = []

    for x in strings:
        if x[len(x)-1] != 'y':
            new_list.append(x + 'y')

    return new_list

print(no_yy(['a', 'b', 'c']))
print(no_yy(['a', 'b', 'cy']))
print(no_yy(['xx', 'ya', 'zz']))
