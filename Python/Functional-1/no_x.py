
# given a list of strings, return a list where each string has all its "x" removed
def no_x(list):
    new_list = []

    for x in list:
        if 'x' in x:
            new_list.append(x.replace('x', ''))
        else:
            new_list.append(x)

    return new_list

print(no_x(['ax', 'bb', 'cx']))
print(no_x(['xxax', 'xbxbx', 'xxcx']))
print(no_x(['x']))
